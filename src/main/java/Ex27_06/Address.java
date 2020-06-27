package Ex27_06;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Address {
    private String street;
    private String city;
    private String country;
    private int flatNo;
    private int homeNo;

    public void showAddress() {
        System.out.println("Ulica: " + this.street + "  Miasto: " + this.city + "  Kraj: " + this.country + "  Blok: " + this.flatNo + "  Mieszkanie: " + this.homeNo);
    }
}
