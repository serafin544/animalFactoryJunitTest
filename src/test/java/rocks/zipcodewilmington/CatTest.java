package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {

        Cat cat = new Cat(null, null, null);
        String givenName = "pussy";

        cat.setName(givenName);

        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);

    }
    @Test
    public void speakTest(){
        Cat cat = new Cat(null,null,null);
        String speak = "Meow";
        cat.speak();
        String givenSpeak = cat.speak();
        Assert.assertEquals(speak,givenSpeak);
    }
    @Test
    public void setBirthDate(){
        Cat cat = new Cat(null, null,null);
        Date setDate = new Date();
        cat.setBirthDate(setDate);

        Date currentDate = cat.getBirthDate();

        Assert.assertEquals(setDate,currentDate);

    }
    @Test
    public void eatTest(){
        Cat cat = new Cat(null,null,null);
        Food test = new Food();
        cat.eat(test);
        int expected = 1;
        int stateTwo = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected,stateTwo);

    }
    @Test
    public void getId(){
        Cat cat = new Cat(null, null,0);
       int expected = 0;
       int actual = cat.getId();

       Assert.assertEquals(expected,actual);


    }
    @Test
    public void inheritanceAnimalTest(){
        Cat cat = new Cat(null,null,null);
        System.out.println(cat instanceof Animal);
    }
    @Test
    public void inheritanceMammalTest(){
        Cat cat = new Cat(null,null,null);
        System.out.println(cat instanceof Mammal);

    }

}