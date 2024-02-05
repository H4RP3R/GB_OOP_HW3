import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import components.Component;
import components.Penicillin;
import components.Salt;
import components.Water;
import pharmacy.Pharmacy;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharm1 = new Pharmacy("pharm1");
        pharm1
                .addComponent(new Water("water 1", 12, 4))
                .addComponent(new Penicillin("penicillin 1", 4.5, 44))
                .addComponent(new Salt("salt 1", 3, 12));

        Pharmacy pharm2 = new Pharmacy("pharm2");
        pharm2
                .addComponent(new Water("water 2", 30.2, 13))
                .addComponent(new Penicillin("penicillin 2", 17, 60))
                .addComponent(new Salt("salt 2", 40, 22));

        Pharmacy pharm3 = new Pharmacy("pharm3");
        pharm3
                .addComponent(new Water("water 3", 20.2, 7))
                .addComponent(new Penicillin("penicillin 3", 48.1, 5))
                .addComponent(new Salt("salt 3", 90, 6));

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharm1);
        pharmacies.add(pharm2);
        pharmacies.add(pharm3);

        System.out.println(pharmacies);
        Collections.sort(pharmacies);
        System.out.println("\nSort by total power:");
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println(pharmacy);
        }

        // *
        Collections.sort(pharmacies, (p1, p2) -> Double.compare(p1.getTotalWeight(), p2.getTotalWeight()));
        System.out.println("\nSort by total weight:");
        for (Pharmacy pharmacy : pharmacies) {
            System.out.println(pharmacy);
        }
    }
}
