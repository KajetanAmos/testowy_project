package Homework20;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cow krowa = new Cow();
        Cat kotek = new Cat();
        Dog piesek = new Dog();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(krowa);
        listOfAnimals.add(kotek);
        listOfAnimals.add(piesek);
        for(Animal zwierze:listOfAnimals){
            System.out.println(zwierze.makeSound());
        }
    }

}
