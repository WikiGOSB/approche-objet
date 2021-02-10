package fr.maps;

import java.util.HashMap;
import java.util.Iterator;

public class CreationMap {
    public static void main(String[] args) {
//        HashMap<String, Integer> mapSalaire = new HashMap<>();
//        mapSalaire.put("Paul", 1750);
//        mapSalaire.put("Hicham", 1825);
//        mapSalaire.put("Yu", 2250);
//        mapSalaire.put("Ingrid", 2015);
//        mapSalaire.put("Chantal", 2418);
//
//        System.out.println("Taille de la map : " + mapSalaire.size());

        HashMap<Integer, String> mapVilles = new HashMap<>();

        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        Iterator<Integer> keyIterator = mapVilles.keySet().iterator();

        while(keyIterator.hasNext())
        {
            Integer cle = keyIterator.next();
            System.out.println("Clé : "+cle);
        }

        //ENSEMBLE DES VALEURS
//        Iterator<String> valuesIte = mapVilles.values().iterator();
//
//        System.out.println("Taille de la map : "+ mapVilles.size());
//
//        while (valuesIte.hasNext()) {
//            String element = valuesIte.next();
//            System.out.println(element);
//        }
    }
}
