package fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String dateOp, double montant) {
        super(dateOp, montant);
    }

    public String type(){
        return "DEBIT";
    }
}
