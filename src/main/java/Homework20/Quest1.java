package Homework20;

public class Quest1 {
    public static void printMulti(int number) {
        for (int i = 1; i <= number; i++) {
            int result = 5 * i;
            System.out.println("5 x " + i + " = " + result);
        }
    }
    public static void main(String[] args){
        printMulti(5);
    }
}
