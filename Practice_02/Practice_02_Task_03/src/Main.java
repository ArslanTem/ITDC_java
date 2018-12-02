import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Введите четырехзначное число");
         int number = scanner.nextInt();
         int num1 = number/1000;
         int num2 = (number%1000)/100;
         int num3 = (number%100)/10;
         int num4 = number%10;

         System.out.println(num1+num2+num3+num4);
    }
}
