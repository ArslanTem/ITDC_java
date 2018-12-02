import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Write a minimum number: ");
         int min = scanner.nextInt();
        System.out.println("Write a maximum number: ");
        int max = scanner.nextInt();

        int random = (int) (min + Math.random() * (max - min + 1));
        System.out.printf("Случайно число от %d до %d: %d\n", min, max, random);

    }
}
