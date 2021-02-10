package fr.tri;

import java.util.Comparator;
import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {
            HashSet<Pays> set = new HashSet<Pays>();

            Pays set1 = new Pays("Etats-Unis", 330252859, 62794.59);
            set.add(set1);

            Pays set2 = new Pays("France", 67000000, 41463.64);
            set.add(set2);

            Pays set3 = new Pays("Allemagne", 83000000,  41508);
            set.add(set3);

            Pays set4 = new Pays("UK", 66000000, 37750);
            set.add(set4);

            Pays richerCountry = set.stream().max(Comparator.comparing(Pays::getPibHab)).get();
            Pays pibTotalPlusIm = set.stream().max(Comparator.comparingInt(ville -> (int) (ville.getPibHab() * ville.getNbHab()))).get();

            Pays lowerPibTotalCountry = set.stream().min(Comparator.comparingInt(o -> (int) (o.getPibHab() * o.getNbHab()))).get();
            set.remove(lowerPibTotalCountry);

            lowerPibTotalCountry.setNom(lowerPibTotalCountry.getNom().toUpperCase());
            set.add(lowerPibTotalCountry);

            for (Pays pay : set) {
                System.out.println(pay);
            }
    }
}
