public class Triangle extends Shape {

    public Triangle(int length, int heigth) {
        super(length, heigth);
    }

    public int calculateArea() {
        return length * heigth / 2;
    }
}
