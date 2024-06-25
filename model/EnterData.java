package model;

import java.util.List;
import java.util.Scanner;

public class EnterData {
    public static List<ComplexNumber> enterDataInConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Первое число. Введите действительную часть: ");
        int re1 = scanner.nextInt();
        System.out.println("Первое число. Введите мнимую часть: ");
        int im1 = scanner.nextInt();
        System.out.println("Второе число. Введите действительную часть: ");
        int re2 = scanner.nextInt();
        System.out.println("Второе число. Введите мнимую часть: ");
        int im2 = scanner.nextInt();
        return List.of(new ComplexNumber(re1, im1), new ComplexNumber(re2, im2));
    }
}
