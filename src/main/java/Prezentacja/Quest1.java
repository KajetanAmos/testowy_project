package Prezentacja;

public class Quest1 {
    public static void ex1(String[] tableOfNames) {
        for (String name : tableOfNames) {
            System.out.println("Hello: " + name);
        }
    }

    public static String ex2(String[] tableOfProducts) {
        String list = "";
        for (String product : tableOfProducts) {
            list += product + ", ";
        }
        return list;
    }

    public static void main(String[] args) {
        String[] names = {"Kajetan", "Marcin", "Jan", "Mateusz", "Henryk"};
        String[] products = {"Szynka", "Maslo", "Ser"};
        ex1(names);
        String result = ex2(products);

        System.out.printf(result);
    }


}



