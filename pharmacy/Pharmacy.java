package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import components.Component;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components;
    private int idx;
    private String name;

    public Pharmacy(String name) {
        this.name = name;
        components = new ArrayList<>();
        idx = 0;
    }

    public Pharmacy addComponent(Component item) {
        components.add(item);

        return this;
    }

    public int getTotalPower() {
        int totalPower = 0;
        for (Component component : components) {
            totalPower += component.getPower();
        }

        return totalPower;
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (Component component : components) {
            totalWeight += component.getWeight();
        }

        return totalWeight;
    }

    @Override
    public String toString() {
        return String.format("'%s' (total power:%s, total weight:%s)", name, getTotalPower(), getTotalWeight());
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return idx < components.size();
            }

            @Override
            public Component next() {
                return components.get(idx++);
            }
        };
    }

    @Override
    public int compareTo(Pharmacy p) {
        return Integer.compare(getTotalPower(), p.getTotalPower());
    }
}