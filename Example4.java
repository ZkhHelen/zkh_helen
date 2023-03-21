/*Захожая Е.М.
*/

public class Example4 {
    public static void main(String[] args) { //главный метод
        Circle circle = new Circle(10); //создание объекта класса
        System.out.print("Площадь круга: ");
        System.out.println(circle.getSquare()); //вывод результата
        System.out.print("Периметр круга: ");
        System.out.println(circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4,8);
        System.out.print("Площадь прямоугольника: ");
        System.out.println(rectangle.getSquare());
        System.out.print("Периметр прямоугольника: ");
        System.out.println(rectangle.getPerimeter());

        Triangle triangle = new Triangle(5,4,8);
        System.out.print("Площадь треугольника: ");
        System.out.println(triangle.getSquare());
        System.out.print("Периметр треугольника: ");
        System.out.println(triangle.getPerimeter());

        Ellipse ellipse = new Ellipse(11, 20);
        System.out.print("Площадь эллипса: ");
        System.out.println(ellipse.getSquare());
        System.out.print("Периметр эллипса: ");
        System.out.println(ellipse.getPerimeter());
    }

}
