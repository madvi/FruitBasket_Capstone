package fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class FruitsInBasket {

    List<Fruit> firstLayer = new ArrayList<>();
    List<Fruit> secondLayer = new ArrayList<>();
    List<Fruit> thirdLayer = new ArrayList<>();


    public void sortByColour(List<Fruit> fruitBowl) {

        for (int i = 0; i < fruitBowl.size(); i++) {
            if (fruitBowl.get(i).color.equalsIgnoreCase("Red")) {

                firstLayer.add(fruitBowl.get(i));
            } else if
            (fruitBowl.get(i).color.equalsIgnoreCase("Yellow")) {
                secondLayer.add(fruitBowl.get(i));
            } else
                thirdLayer.add(fruitBowl.get(i));
        }

        printFruitBasket(firstLayer, "1st");
        printFruitBasket(secondLayer,"2nd");
        printFruitBasket(thirdLayer,"3rd");
    }

        public void printFruitBasket(List<Fruit> fruits, String layer){
        System.out.println("The fruits in basket are arranged by color in "+layer+" layer is");
        for(Fruit fruit:fruits){
            System.out.println(fruit.getName()+" " + "=" + " "+fruit.getColor());
        }
    }
}
