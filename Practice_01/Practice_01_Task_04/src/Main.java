import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Введите первое число");
         int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
         int secondNumber = scanner.nextInt();
           System.out.println(firstNumber + "+" +secondNumber + "=" +(firstNumber+secondNumber));

    }
}
