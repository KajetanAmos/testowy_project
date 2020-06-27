package Ex27_06;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Engine {
    private Integer capacity;
    private Integer horsePower;
    private Integer fuelConsumption;
}
