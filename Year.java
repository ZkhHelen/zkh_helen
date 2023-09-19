import java.io.*;

public class Year implements Serializable {
    private int year;
    private Month[] months;

    public Year(int year) {
        this.year = year;
        this.months = new Month[12];
        initializeMonths();
    }

    private void initializeMonths() {
        for (int i = 0; i < 12; i++) {
            months[i] = new Month(i + 1);
        }
    }

    public Month[] getMonths() {
        return months;
    }

    // Другие методы и геттеры/сеттеры

    public void serialize(String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(this);
            System.out.println("Объект успешно сериализован в " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Year deserialize(String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Year year = (Year) objectIn.readObject();
            System.out.println("Объект успешно десериализован из " + fileName);
            return year;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Year{" +
                "year=" + year +
                '}';
    }
}