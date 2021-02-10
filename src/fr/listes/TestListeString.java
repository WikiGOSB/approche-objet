package fr.listes;

import java.util.*;
import java.util.stream.Collectors;

public class TestListeString {
    public static void main(String[] args) {

        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Nice");
        liste1.add("Carcassonne");
        liste1.add("Narbonne");
        liste1.add("Lyon");
        liste1.add("Foix");
        liste1.add("Pau");
        liste1.add("Marseilles");
        liste1.add("Tarbes");

        //RETOURNE LA PLUS GRANDE CHAINE DE CARACTERE DE MA LISTE
        String grandElement = liste1.get(0);
        for (String element : liste1) {

            if(element.length() > grandElement.length())
            {
                grandElement = element;
            }
        }
        System.out.println("Mot le plus grand : "+grandElement);

        //PASSER LE NOMS DES VILLES EN MAJ
        ListIterator<String> iterator = liste1.listIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            iterator.set(next.toUpperCase());
        }

        //SUPPR LES VILLES QUI COMMENCENT PAR N DE MA LISTE (PAS FINI)
        List<String> listwithoutN = liste1.stream().filter(s -> s.charAt(0) != 'N').collect(Collectors.toList());

        System.out.println(listwithoutN);

    }
}
