import java.sql.Array;
import java.util.Scanner;

public class task1 {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        System.out.print("Введите n-ое число: ");
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        int triangle = (n * (n + 1)) / 2;
        System.out.printf("n-ое треугольное число: %s\n", triangle);
        System.out.printf("%s! (факториал): %s", n, fact);

        //2) Вывести все простые числа от 1 до 1000
        /*int n = 1000;
        int number = 2;

        while (number <= n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }*/


        //3) Реализовать простой калькулятор
        /*System.out.print("Введите 1-ое число: ");
        int n1 = in.nextInt();
        System.out.print("Введите 2-ое число: ");
        int n2 = in.nextInt();
        System.out.print("Введите операцию: ");
        String operation = in.next();

        switch (operation) {
            case "+":
                System.out.printf("%d + %d = %d", n1, n2, n1 + n2);
                break;
            case "-":
                System.out.printf("%d - %d = %d", n1, n2, n1 - n2);
                break;
            case "*":
                System.out.printf("%d * %d = %d", n1, n2, n1 * n2);
                break;
            case "/":
                System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
                break;
            default:
                System.out.println("Неизвестный оператор");
                break;

        }*/


    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
