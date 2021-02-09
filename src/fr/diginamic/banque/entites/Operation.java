package fr.diginamic.banque.entites;

public abstract class  Operation {
    protected String dateOp ;
    protected double montant;

    public Operation(String dateOp, double montant) {
        this.dateOp = dateOp;
        this.montant = montant;
    }

    public abstract String type();

    public void getType(){
        System.out.println("Type de l'opération : "+ type());
    }

    public String getDateOp() {
        return dateOp;
    }

    public void setDateOp(String dateOp) {
        this.dateOp = dateOp;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
