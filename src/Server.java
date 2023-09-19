import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    private static final String HOST = "localhost";
    private static final int PORT = 1099;
    private static Registry registry;
    public static void main(String[] args) {
        try {
            // Создаем объект удаленного реестра на порту 1099

            Registry registry = LocateRegistry.createRegistry(PORT);

            YearService yearService = new YearServiceImpl();

            // Регистрируем удаленный объект в реестре
            registry.bind("YearService", yearService);

            System.out.println("Сервер запущен...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}