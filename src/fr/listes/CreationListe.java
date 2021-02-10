package fr.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> listes = new ArrayList<Integer>();

        int i = 0;
        for(i=0; i<=100; i++){
            listes.add(i);
        }
        System.out.println(listes.size());

//        for(Integer elem: listes)
//        {
//            System.out.println (elem);
//        }

    }
}
