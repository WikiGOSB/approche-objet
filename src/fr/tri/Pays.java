package fr.tri;

import java.util.HashSet;

public class Pays {
    private String nom;
    private int nbHab;
    private double pibHab;

    public Pays(String nom, int nbHab, double pibHab) {
        this.nom = nom;
        this.nbHab = nbHab;
        this.pibHab = pibHab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHab() {
        return nbHab;
    }

    public void setNbHab(int nbHab) {
        this.nbHab = nbHab;
    }

    public double getPibHab() {
        return pibHab;
    }

    public void setPibHab(double pibHab) {
        this.pibHab = pibHab;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHab=" + nbHab +
                ", pibHab=" + pibHab +
                '}';
    }
}
