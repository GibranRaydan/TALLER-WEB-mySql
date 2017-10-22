package dao;

import model.Tabla;
import util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.UnidadAbstractaInformacion;

public class UnidadAbstractaInformacionDAO {

    private Connection connection;

    public UnidadAbstractaInformacionDAO() throws SQLException {
        connection = DbUtil.getConnection();
    }

    public boolean addUnidad(UnidadAbstractaInformacion unidad) throws SQLException {
          boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into unidadabstractainformacion (unidadabstractainformacion.id_contexto,unidadabstractainformacion.id_tabla) values (?, ? );";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, unidad.getId_contexto());
            preparedStmt.setInt(2, unidad.getTabla());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    
     public List<UnidadAbstractaInformacion> getAllUnidad() throws SQLException {
      List<UnidadAbstractaInformacion> unidad = null;
      boolean result = false;
        String query = "SELECT * FROM unidadabstractainformacion";
        Connection connection = DbUtil.getConnection();
        try {
            
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           
            int id =0;
            int id_contexto = 0;
            int id_tabla = 0;

            while (rs.next()) {
                if (unidad == null) {
                    unidad = new ArrayList<UnidadAbstractaInformacion>();
                }
                UnidadAbstractaInformacion registro = new UnidadAbstractaInformacion(id_contexto,id_tabla);
                id = rs.getInt("id");
                registro.setId_unidad(id);

                id_contexto = rs.getInt("id_contexto");
                registro.setId_contexto(id_contexto);
                
                id_tabla = rs.getInt("id_tabla");
                registro.setTabla(id_tabla);


                unidad.add(registro);

            }
             if(unidad!=null)
            for (int i = 0; i < unidad.size(); i++) {
                System.out.println(unidad.get(i).getId_unidad()+ " " + unidad.get(i).getId_contexto()+" "+unidad.get(i).getTabla());
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Tablas");
            e.printStackTrace();
        }

        return unidad;
    
    }

    
    
    
  
}