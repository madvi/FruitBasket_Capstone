package fruitbowl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Segregator {

    List<Fruit> fruit;
    List<String> fruitByColour;
    FruitBasket fruitBasket;


    public Segregator(List<Fruit> fruit) {
        this.fruit = fruit;
        fruitByColour=fruit.stream().map(i -> i.getColour()).distinct().collect(Collectors.toList());
    }
    public void sortByColour(List<Fruit> fruit) {
        System.out.println("--Arranged based on colour--");
        for (String colour : fruitByColour) {
            fruitBasket=new FruitBasket(colour);
            List<String> fruitColour = fruit.stream()
                    .filter(f -> f.getColour().equalsIgnoreCase(colour)).map(f -> f.getName()).collect(Collectors.toList());
            System.out.printf("Fruits %s is %s in colour %n", fruitColour,fruitBasket.getLayer());
            System.out.println("");
        }
    }
}
