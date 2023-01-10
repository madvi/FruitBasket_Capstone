package fruitbowl;

public class Fruit {
    private String name;
    public String colour;
    private String size;


    public Fruit(String name, String colour, String size) {
        this.name = name;
        this.colour = colour;
        this.size = size;

    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }
}

