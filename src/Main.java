public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,3);
        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());
        Triangle triangle = new Triangle(3,3);
        System.out.println(triangle);
    }
}