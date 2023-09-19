import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private static final String HOST = "localhost";
    private static final int PORT = 1099;
    private static Registry registry;
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(HOST, PORT);
            YearService yearService = (YearService) registry.lookup("YearService");

            // Создайте объект Year, который вы хотите передать
            Year yearToPass = new Year(2024);

            // Вызов удаленного метода и получение результата
            Year resultYear = yearService.getYear(yearToPass);

            System.out.println("Полученный объект Year: " + resultYear);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}