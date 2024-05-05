import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        scanner.close();

        System.out.println("Привет, " + name + "!");
    }
}