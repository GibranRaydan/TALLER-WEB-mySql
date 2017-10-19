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

    
    
    
  
}