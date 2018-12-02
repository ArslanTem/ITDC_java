import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum, count, number;
        count = number = scanner.nextInt();
        while (number != 0) {
            number = scanner.nextInt();
            sum += number;
            ++count;
        }

        if (i != 0) {
            System.out.printf("Среднее арифметическое 3.5%n", sum / count);
        } else {
            System.out.println("Нет данных для расчёта");
        }
    }

}