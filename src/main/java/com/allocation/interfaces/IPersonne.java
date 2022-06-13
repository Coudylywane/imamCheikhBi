package com.allocation.interfaces;

import java.util.List;

import com.allocation.model.Personne;

public interface IPersonne {

    boolean addPersonne(Personne personne);
    List <Personne> getAllPersonne();
    Personne getPersonneById(int id);
    Personne getPersonneByEmail(String email);
    
}
