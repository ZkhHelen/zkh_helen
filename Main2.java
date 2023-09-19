import java.util.Scanner;
import java.util.regex.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd/mm/yyyy: ");
        String input = scanner.nextLine();
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/((?:16|17|18|19|20)\\d{2}|9999)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Строка является датой в формате dd/mm/yyyy.");
        } else {
            System.out.println("Строка не является датой в формате dd/mm/yyyy или находится вне диапазона допустимых дат.");
        }
    }
}
