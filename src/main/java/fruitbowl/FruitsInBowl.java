package fruitbowl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FruitsInBowl {

    public static void main(String[] args) throws IOException {

        Fruit fruit1 = new Fruit("Apple", "Red", "Small");
        Fruit fruit2 = new Fruit("Grapes", "Green", "Large");
        Fruit fruit3 = new Fruit("Cherry", "Red", "Medium");
        Fruit fruit4 = new Fruit("Banana", "yellow", "Medium");
        Fruit fruit5 = new Fruit("Kiwi", "Green", "Small");
        Fruit fruit6 = new Fruit("Guava", "yellow", "Large");

        List<Fruit> fruitBowl = new ArrayList<>();//storing the fruits in arraylist
        fruitBowl.add(fruit1);
        fruitBowl.add(fruit2);
        fruitBowl.add(fruit3);
        fruitBowl.add(fruit4);
        fruitBowl.add(fruit5);
        fruitBowl.add(fruit6);


        FruitsInBasket fruitInBasket = new FruitsInBasket();
        fruitInBasket.sortByColour(fruitBowl);


    }

}
