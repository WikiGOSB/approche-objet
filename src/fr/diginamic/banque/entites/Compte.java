package fr.diginamic.banque.entites;

public class Compte {
    private static int nb;
    private int numCompte;
    private double solde;

    public Compte(double solde) {
        this.numCompte = nb;
        this.solde = solde;
        nb++;
    }

    public static int getNb() {
        return nb;
    }

    public static void setNb(int nb) {
        Compte.nb = nb;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }
}
