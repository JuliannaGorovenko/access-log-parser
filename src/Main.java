import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число #1:");
        int firstNumber = (new Scanner(System.in)).nextInt();
        System.out.println("Введите число #2:");
        int secondNumber = (new Scanner(System.in)).nextInt();
        double sum = (double) firstNumber+secondNumber;
        double difference  = (double) firstNumber-secondNumber;
        double product = (double) firstNumber*secondNumber;
        double quotient = (double) firstNumber/secondNumber;
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}
