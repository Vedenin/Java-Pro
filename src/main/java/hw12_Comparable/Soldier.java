package hw12_Comparable;

public class Soldier implements Comparable<Soldier> {
    private String name;
    private int height;

    public Soldier(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", height=" + height + '\n';
    }

    @Override
    public int compareTo(Soldier o) {
        return o.height - this.height;
    }
}
