package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] ops = new Operation[4];
        ops[0] = new Credit("01/01/2021",1111);
        ops[1] = new Credit("02/01/2021",2222);
        ops[2] = new Debit("03/01/2021",12);
        ops[3] = new Debit("04/01/2021",123);

        double res = 0;
        double valCompte = 1000;

        for (Operation element : ops){
            if(element.type() == "DEBIT"){
               res = valCompte - element.getMontant();
            }
            else{
                res = valCompte + element.getMontant();
            }
           // System.out.println("Le : " + element.getDateOp() +" "+ element.type()+" de : "+ element.getMontant());
            System.out.println("Le : " + element.getDateOp() +", "+ element.type()+" de : "+ res);
        }
    }

}
