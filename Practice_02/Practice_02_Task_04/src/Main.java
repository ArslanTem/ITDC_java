import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        final double sm_in_inches = 2.54;
         System.out.println("Введите значение в дюймах?");
         double inch = scaner.nextDouble();
         double sm = inch*sm_in_inches;
         System.out.println(inch+" дюйм = "+sm);

    }
}
