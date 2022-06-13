package com.allocation.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.allocation.model.Personne;

public class PersonneDao {
    public ResultSet getAllPersonne() throws SQLException {
        Connection conn = DB.getConnection();
        String query = "SELECT * FROM personne";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet rs = statement.executeQuery();
        return rs;
    }

    public boolean addPersonne(Personne personne) {
        Connection conn = DB.getConnection();
        String query = "INSERT INTO personne(nom,prenom,email) VALUES(?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, personne.getNom());
            statement.setString(2, personne.getPrenom());
            statement.setString(3, personne.getEmail());

            statement.execute();
            statement.close();
            conn.close();

            return true;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
}
