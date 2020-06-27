package Ex27_06;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public abstract class Car {
    private String producer;
    private String model;
    private String color;
    private Integer seatsNumber;
    private Engine engine;

    public Car() {
        this.seatsNumber = 2;

    }

    public Car(String producer, String model, String color, Integer seatsNumber, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatsNumber;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engine=" + engine +
                '}';
    }
}
