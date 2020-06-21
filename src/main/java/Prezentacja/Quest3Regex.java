package Prezentacja;

import java.util.regex.Pattern;

public class Quest3Regex {
    public static boolean isIdCorrect(String id) {
        Pattern idPattern = Pattern.compile("[0-9]{11}");
        return idPattern.matcher(id).matches();
    }

    public static boolean isEmail(String email) {
        Pattern emailPattern = Pattern.compile("[A-Za-z0-9_\\.\\-]+@[a-z0-9\\.\\-]+");
        return emailPattern.matcher(email).matches();

    }

    public static void main(String[] args) {
        System.out.println("Is id correct?:"+ isIdCorrect("93013021134"));
        System.out.println("Is id correct?: "+ isIdCorrect("900230112244"));
        System.out.println("Is email correct: "+ isEmail("abzcda.bbqq03@gmail.com"));
    }
}
