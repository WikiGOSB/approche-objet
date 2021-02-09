package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double numRem;

    public CompteTaux(double solde, double numRem) {
        super(solde);
        this.numRem = numRem;
    }

    @Override
    public String toString() {
        return super.toString() + " dont le taux de rémunération est : " + numRem;
    }

}