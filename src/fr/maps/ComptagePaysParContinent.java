
import fr.maps.Pays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComptagePaysParContinent {

    public static void main(String[] args) {

        ArrayList<Pays> pays = new ArrayList<>();
        pays.add(new Pays("France", "Europe", 65000000));
        pays.add(new Pays("Allemagne", "Europe", 80000000));
        pays.add(new Pays("Belgique", "Europe", 10000000));
        pays.add(new Pays("Russie", "Asie", 150000000));
        pays.add(new Pays("Chine", "Asie", 1400000000));
        pays.add(new Pays("Indonesie", "Océanie", 220000000));

        HashMap<String, Integer> paysParContinent = new HashMap<>();

        for (Pays p : pays)
            paysParContinent.merge(p.getContinent(), 1, Integer::sum);

        for (Map.Entry<String, Integer> stringIntegerEntry : paysParContinent.entrySet())
            System.out.println(stringIntegerEntry);

    }

}
