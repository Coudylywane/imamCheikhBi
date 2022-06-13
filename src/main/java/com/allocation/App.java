package com.allocation;

import java.util.List;

import com.allocation.DAO.DB;
import com.allocation.model.Personne;
import com.allocation.services.PersonneService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PersonneService personneService = new PersonneService();

        Personne personne1 = new Personne();
        personne1.setEmail("admin@mail.com");
        personne1.setNom("admin");
        personne1.setPrenom("admin");
        personneService.addPersonne(personne1);

        List<Personne> personnes = personneService.getAllPersonne();
        for (Personne personne : personnes) {
            System.out.println("##########################");
            System.out.println("ID : " + personne.getId());
            System.out.println("Nom : " + personne.getNom());
            System.out.println("Prenom : " + personne.getPrenom());
            System.out.println("Email : " + personne.getEmail());
        }
    }
}
