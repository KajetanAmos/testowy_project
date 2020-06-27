package Ex27_06;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String name;
    private String surname;
    private int age;
    private Address address;
    public Person(String name,String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Mam na imię: " + this.name + " na nazwisko: " + this.surname + " i mam lat: " + this.age);
    }


    public Address getAddress(){
        return this.address;
    }
}
