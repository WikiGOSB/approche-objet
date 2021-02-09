package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

import java.util.ArrayList;

public class TestBanque {
    public static void main(String[] args) {
        Compte miguel = new Compte(1200);
        CompteTaux mig = new CompteTaux(12,0.10);

 //       System.out.println(miguel.getNumCompte());

//        ArrayList<Compte> tabCompte = new ArrayList<Compte>();
//
//        tabCompte.add(miguel);
//        tabCompte.add(mig);
//
//        for(Compte element : tabCompte){
//            System.out.println(element);
//        }

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(1200);
        comptes[1] = new CompteTaux(1500, 20);

        for(Compte element : comptes){
            System.out.println(element);
        }
    }
}
