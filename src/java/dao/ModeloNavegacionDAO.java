/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
}