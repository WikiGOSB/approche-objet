package essais;

import entites.*;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale rolito = new AdressePostale("5","Rue du Gandouget", "78990","Élancourt");
        AdressePostale miguelito = new AdressePostale("16","Rue Charpentier", "91240","St Michel S/O");

        Personne roland = new Personne("Mai","Roland", rolito);
        Personne miguel = new Personne("Teixeira","Miguel", miguelito);
    }
}
