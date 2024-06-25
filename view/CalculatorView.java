package view;

import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import controller.CalculatorController;
import model.ComplexNumber;
import model.EnterData;

public class CalculatorView {
    private CalculatorController controller = new CalculatorController();
    Logger logger = Logger.getLogger(CalculatorView.class.getName());

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Сложение комплексных чисел");
            System.out.println("2 - Умножение комплексных чисел");
            System.out.println("3 - Деление комплексных чисел");
            System.out.println("4 - выход");

            switch (scanner.nextInt()) {
                case 1 -> Addition();
                case 2 -> Multiplication();
                case 3 -> Division();
                case 4 -> System.exit(0);// выход из приложения

                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private ComplexNumber Division() {
        List<ComplexNumber> numbers = EnterData.enterDataInConsole();
        controller.setOperation(new model.impl.Division());
        ComplexNumber result = controller.calculate(numbers.get(0), numbers.get(1));
        try {
            FileHandler fileHandler = new FileHandler("app.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
            logger.info("Комплесные числы: [" + numbers.get(0).getReal()
                    + "," + numbers.get(0).getImaginary() + "] " + "[" + numbers.get(1).getReal()
                    + "," + numbers.get(1).getImaginary() + "]" + "\n"
                    + "Результат: " + result + "\n");
        } catch (Exception e) {
            logger.severe("Ошибка при настройке логгирования: " + e.getMessage());
        }
        return result;
    }

    private ComplexNumber Multiplication() {
        List<ComplexNumber> numbers = EnterData.enterDataInConsole();
        controller.setOperation(new model.impl.Multiplication());
        ComplexNumber result = controller.calculate(numbers.get(0), numbers.get(1));
        try {
            FileHandler fileHandler = new FileHandler("app.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
            logger.info("Комплесные числы: [" + numbers.get(0).getReal()
                    + "," + numbers.get(0).getImaginary() + "] " + "[" + numbers.get(1).getReal()
                    + "," + numbers.get(1).getImaginary() + "]" + "\n"
                    + "Результат: " + result + "\n");
        } catch (Exception e) {
            logger.severe("Ошибка при настройке логгирования: " + e.getMessage());
        }
        return result;
    }

    private ComplexNumber Addition() {
        List<ComplexNumber> numbers = EnterData.enterDataInConsole();
        controller.setOperation(new model.impl.Addition());
        ComplexNumber result = controller.calculate(numbers.get(0), numbers.get(1));
        try {
            FileHandler fileHandler = new FileHandler("app.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
            logger.info("Комплесные числы: [" + numbers.get(0).getReal()
                    + "," + numbers.get(0).getImaginary() + "] " + "[" + numbers.get(1).getReal()
                    + "," + numbers.get(1).getImaginary() + "]" + "\n"
                    + "Результат: " + result + "\n");
        } catch (Exception e) {
            logger.severe("Ошибка при настройке логгирования: " + e.getMessage());
        }
        return result;

    }
}
