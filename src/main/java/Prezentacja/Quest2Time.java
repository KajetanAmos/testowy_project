package Prezentacja;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Quest2Time {
    public static void dateNow() {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime: " + ldt);
        Instant now = Instant.now();
        System.out.println("Instant: " + now);
    }

    public static void timeTokyoNow() {
        Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));
        LocalDateTime ldt = LocalDateTime.now(clock);
        System.out.println("TokyoTime: " + ldt);
    }

    public static void dateFormat() {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
        System.out.println("DateInFormat yyyy/MM/dd hh:mm:ss: " + formatter.format(ldt));
    }

    public static void main(String[] args) {
        dateNow();
        timeTokyoNow();
        dateFormat();
    }
}
