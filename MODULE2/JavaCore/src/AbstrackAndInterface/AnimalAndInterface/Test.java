package AbstrackAndInterface.AnimalAndInterface;

import AbstrackAndInterface.AnimalAndInterface.Animal.Animal;
import AbstrackAndInterface.AnimalAndInterface.Animal.Chicken;
import AbstrackAndInterface.AnimalAndInterface.Animal.Tiger;
import AbstrackAndInterface.AnimalAndInterface.Fruit.Apple;
import AbstrackAndInterface.AnimalAndInterface.Fruit.Fruit;
import AbstrackAndInterface.AnimalAndInterface.Fruit.Orange;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
