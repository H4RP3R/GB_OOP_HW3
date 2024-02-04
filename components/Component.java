package components;

public abstract class Component implements Comparable<Component> {
    private String title;
    private double weight;
    private int power;

    public Component(String title, double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("title:'%s' weight:%s power:%s", title, weight, power);
    }

    @Override
    public int compareTo(Component c) {
        return Integer.compare(power, c.power);
    }
}