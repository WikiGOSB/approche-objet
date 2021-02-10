package fr.listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListesInt {
    public static void main(String[] args) {

        ArrayList<Integer> liste1 = new ArrayList<>();
        liste1.add(-1);
        liste1.add(5);
        liste1.add(7);
        liste1.add(3);
        liste1.add(-2);
        liste1.add(4);
        liste1.add(8);
        liste1.add(5);

        // RETOURNE LA TAILLE DE MA LISTE
//        System.out.println(liste1.size());

        //RETOURNE LA PLUS GRANDE VALEUR DE MA LISTE
//        Object element = Collections.max(liste1);

        //SUPPRIMER LE PLUS PETIT ELEMENT
        liste1.remove(Collections.min(liste1));

 //             for (Integer elem : liste1){
//            System.out.println(elem);
//        }

        //PASSER TOUT LES NEGATIFS DE LA LISTE EN POSITIF
        for (Integer elem : liste1){
            if(elem<0){
                elem = elem * -1;
            }
            System.out.println(elem);
        }
    }
}
