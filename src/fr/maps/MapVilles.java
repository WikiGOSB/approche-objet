package fr.maps;

import fr.tri.Ville;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> villesMap = new HashMap<>();

        villesMap.put("Nice", new Ville("Nice", 343000));
        villesMap.put("Carcassonneé", new Ville("Carcassonne", 478000));
        villesMap.put("Narbonne", new Ville("Narbonne", 53400));
        villesMap.put("Foix", new Ville("Foix", 9700));
        villesMap.put("Pau", new Ville("Pau", 77200));
        villesMap.put("Marseille", new Ville("Marseille", 850700));
        villesMap.put("Tarbes", new Ville("Tarbes", 40600));

        String keyVilleMoinsHabitants = villesMap
                .entrySet()
                .stream()
                .min(Comparator.comparingInt(o -> o.getValue().getNbHabitants()))
                .get().getKey();

        villesMap.remove(keyVilleMoinsHabitants);

        for (Ville value : villesMap.values())
            System.out.println(value);

    }


}
