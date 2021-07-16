package TEST7;

public class Item {

    private String name;
    private double volume;
    private double value;

    public Item(String name, double volume, double value){

        this.name = name;
        this.volume = volume;
        this.value = value;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", value=" + value +
                '}';
    }


}
