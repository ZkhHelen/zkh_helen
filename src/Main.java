public class Main {
    public static void main(String[] args) {
        // Создание объектов годов
        Year year2021 = new Year(2021);
        Year year2022 = new Year(2022);
        Year year2023 = new Year(2023);

        // Создание нескольких объектов месяцев для года 2021
        Month january2021 = year2021.getMonths()[0];
        Month february2021 = year2021.getMonths()[1];


        // Сериализация объектов годов
        year2021.serialize("year2021.ser");
        year2022.serialize("year2022.ser");
        year2023.serialize("year2023.ser");

        // Десериализация объектов годов
        Year deserializedYear2021 = Year.deserialize("year2021.ser");
        Year deserializedYear2022 = Year.deserialize("year2022.ser");
        Year deserializedYear2023 = Year.deserialize("year2023.ser");

        if (deserializedYear2021 != null) {
            System.out.println("Год 2021 после десериализации: " + deserializedYear2021);
        }

        if (deserializedYear2022 != null) {
            System.out.println("Год 2022 после десериализации: " + deserializedYear2022);
        }

        if (deserializedYear2023 != null) {
            System.out.println("Год 2023 после десериализации: " + deserializedYear2023);
        }
    }
}