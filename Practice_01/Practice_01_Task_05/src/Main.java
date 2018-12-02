import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Side a:");
            int sideA = scanner.nextInt();
         System.out.println("Side b:");
            int sideB = scanner.nextInt();
         System.out.println("Side c:");
            int sideC = scanner.nextInt();
            int volume = sideA*sideB*sideC;
            System.out.printf("Объем параллелепипеда =" + "(" + sideA +" x " + sideB +" x " + sideC + ")"+"равен "+volume);

    }
}
