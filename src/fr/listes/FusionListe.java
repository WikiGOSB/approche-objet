package fr.listes;

import java.util.ArrayList;

public class FusionListe {
    public static void main(String[] args) {

        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        ArrayList<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        ArrayList<String> liste3 = new ArrayList<String>();

        //CREER UNE FUSION DES DEUX LISTES EN UNE
        liste3.addAll(liste1);
        liste3.addAll(liste2);

        for(String elem: liste3)
        {
            System.out.println (elem);
        }
    }
}
