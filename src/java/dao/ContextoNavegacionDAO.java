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
/**
 *
 * @author LabingXEON
 */
public class ContextoNavegacionDAO {
     public boolean addContexto( ContextoNavegacion contexto) throws SQLException {
          boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into contextonavegacion (contextonavegacion.link,contextonavegacion.id_modelo) values (?, ? );";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString(1, contexto.getLink());
            preparedStmt.setInt(2, contexto.getId_modelo());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    
    }
}
