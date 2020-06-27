package Ex27_06;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SportsCar extends Car {
    private String radio;
    private String sound;
    public SportsCar(String producer,String model,String color,Integer seatNumber,Engine engine){
        super(producer,model,color,seatNumber,engine);
        this.sound="Brumm Wrrrr brum brum";
    }
    public String makeSound(){
        return this.sound;
    }
}
