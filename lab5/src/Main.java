/**
 * Программа для определения простых чисел из введенных пользователем целых чисел.
 * Использует коллекцию HashSet для хранения найденных простых чисел.
 * @author Захожая Е.М.
 */
import java.util.*;

/**
 * Главный метод программы, который запрашивает у пользователя целые числа,
 * находит среди них простые числа и выводит их на экран.
 */
public class Main {
    public static void main(String[] args) {
        // создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целые числа через пробел: ");
        String input = scanner.nextLine(); // считываем ввод пользователя

        String[] nums = input.split(" "); // разбиваем введенную строку на отдельные числа
        HashSet<Integer> primes = new HashSet<Integer>(); // создаем HashSet для хранения простых чисел

        // проходим по всем числам из введенного списка и проверяем каждое число, используя метод isPrime()
        for (String num : nums) {
            int n = Integer.parseInt(num);
            if (isPrime(n)) { // если число простое, то добавляем его в HashSet
                primes.add(n);
            }
        }

        System.out.println("Простые числа: ");
        // выводим все простые числа из HashSet на экран
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
    /**
     * Метод, который проверяет, является ли переданное число простым.
     * @param n число, которое нужно проверить на простоту
     * @return true, если число простое, и false в противном случае
     */
    public static boolean isPrime(int n) {
        if (n <= 1) { // числа 1 и меньше не являются простыми
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { // перебираем все делители от 2 до квадратного корня из n
            if (n % i == 0) { // если n делится на i без остатка, то n не является простым числом
                return false;
            }
        }
        return true; // если ни один делитель не подошел, то n - простое число
    }
}
