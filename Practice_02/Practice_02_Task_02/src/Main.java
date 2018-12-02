import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first number");
         int a = scanner.nextInt();
        System.out.println("Type second number");
        int b = scanner.nextInt();
         System.out.println(a+" "+b);
         a = a+b;
         b = a-b;
         a = a-b;
         System.out.println(a+" "+b);
    }
}
