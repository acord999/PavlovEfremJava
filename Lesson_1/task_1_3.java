import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        
        int choice = scanner.nextInt();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            default:
                System.out.println("Некорректный выбор операции.");
        }
        
        System.out.println("Результат: " + result);
    }
}


