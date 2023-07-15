import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> A = new LinkedList<>();
        LinkedList<String> B = new LinkedList<>();
        LinkedList<String> C = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите " + (i+1) + " строка списка А: ");
            A.add(i, scanner.next());
        }
        System.out.println("Список А: " + A);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите " + (i+1) + " строка списка B: ");
            B.add(i, scanner.next());
        }
        System.out.println("Список B: " + B);
        Collections.reverse(B);
        for (int i = 0; i < 5; i++) {
            C.add(A.get(i));
            C.add(B.get(i));
        }
        System.out.println("Список C: " + C);
        C.sort(Comparator.comparing(String::length));
        System.out.println("Список С отсортированный по длине: " + C);
    }
}
