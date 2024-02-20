public class Rectangle extends Shape {
    
    public Rectangle(int length, int heigth) {
        super(length, heigth);
    }

    public int calculateArea() {
        return length * heigth;
    }
}

