package problem_solving;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        String first = scanner.nextLine();
//        System.out.println("Enter a number");
//        String second = scanner.nextLine();
//        System.out.println("Enter a number");
//        String third = scanner.nextLine();
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                numbers[i] = value;
            } catch (InputMismatchException e) {
                System.out.println("Enter a valid integer");
                scanner.nextLine();
            }
        }
        for (int num: numbers) {
            System.out.println(num);
        }
    }
}
