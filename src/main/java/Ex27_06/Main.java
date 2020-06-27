package Ex27_06;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Poznańska", "Poznań", "Poland", 20, 30);
        Person person1 = new Person("Marcin", "Kowalski", 35, address);
        person1.introduce();
        Address person1Address = person1.getAddress();
        person1Address.showAddress();
        Person person2 = new Person("Marek", "Nowak", 33);
        person2.setAddress(address);
        person2.introduce();
        person2.getAddress().showAddress();
        Engine v8 = new Engine(5, 600, 20);
        SportsCar ferrari = new SportsCar("Ferrari", "911", "red", 2, v8);
        System.out.println(ferrari.toString());
        ferrari.setRadio("radioEska");
        System.out.println(ferrari.getRadio());
        System.out.println(ferrari.makeSound());
    }
}
