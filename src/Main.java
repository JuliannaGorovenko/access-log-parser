import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Случайное число от 0 до 1: " + Math.random());
        System.out.println("Введите текст и нажмите <Enter>: ");
        String text = (new Scanner(System.in)).nextLine();
        System.out.println("Длина текста: " + text.length());
    }
}
