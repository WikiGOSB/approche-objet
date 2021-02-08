package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestBanque {
    public static void main(String[] args) {
        Compte miguel = new Compte(1200);
        Compte mig = new Compte(-300);

        System.out.println(miguel.getNumCompte());
    }
}
