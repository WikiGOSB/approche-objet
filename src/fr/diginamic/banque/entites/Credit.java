package fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String dateOp, double montant) {
        super(dateOp, montant);
    }

    public String type(){
        return "CREDIT";
    }
}
