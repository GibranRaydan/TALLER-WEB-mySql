/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.UnidadAbstractaInformacion;
import util.DbUtil;
import model.ContextoNavegacion;
import model.ModeloNavegacion;
/**
 *
 * @author LabingXEON
 */
public class ModeloNavegacionDAO {
     public boolean addModelo( ModeloNavegacion modelo) throws SQLException {
          boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into modelonavegacion (modelonavegacion.nombre) values ( ? );";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, modelo.getNombre());
            
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    
    }
     
     public List<ModeloNavegacion> getAllModelos() throws SQLException {
        List<ModeloNavegacion> modelo = null;
        String query = "SELECT * FROM modelo";
        Connection connection = DbUtil.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int id = 0;
            String nombre = null;

            while (rs.next()) {
                if (modelo == null) {
                    modelo = new ArrayList<ModeloNavegacion>();
                }

                ModeloNavegacion registro = new ModeloNavegacion(nombre);
                id = rs.getInt("id");
                registro.setId_modelo(id);

                nombre = rs.getString("nombre");
                registro.setNombre(nombre);

                modelo.add(registro);

            }
           if(modelo!=null)
            for (int i = 0; i < modelo.size(); i++) {
                System.out.println(modelo.get(i).getId_modelo() + " " + modelo.get(i).getNombre());
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Modelos");
            e.printStackTrace();
        }

        return modelo;
    }
     
}