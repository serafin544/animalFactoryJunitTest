package rocks.zipcodewilmington.animals;

import rocks.zipcodewilmington.Food;

/**
 * @author leon on 4/19/18.
 */


//      My camera is on. u dick get away from my computer


public interface Animal {
    String speak();
    Integer getNumberOfMealsEaten();
    Integer getId();
    void eat(Food food);

}
