package com.allocation.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.allocation.DAO.PersonneDao;
import com.allocation.interfaces.IPersonne;
import com.allocation.model.Personne;

public class PersonneService implements IPersonne{

    @Override
    public boolean addPersonne(Personne personne) {
        PersonneDao personneDao = new PersonneDao();
        return personneDao.addPersonne(personne);
    }

    @Override
    public List<Personne> getAllPersonne() {

        PersonneDao personneDao = new PersonneDao();
        List<Personne> personnes = new ArrayList<>();

        try {
            ResultSet rs = personneDao.getAllPersonne();
            if (rs != null) {
                while(rs.next()) {
                    Personne personne = new Personne();
                    personne.setEmail(rs.getString("email"));
                    personne.setNom(rs.getString("nom"));
                    personne.setPrenom(rs.getString("prenom"));
                    personne.setId(rs.getInt("id"));

                    personnes.add(personne);
                }
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

        return personnes;
    }

    @Override
    public Personne getPersonneById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Personne getPersonneByEmail(String email) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
