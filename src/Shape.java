public class Shape {
    protected int length, heigth;

    public Shape(int length, int heigth) {
        this.length = length;
        this.heigth = heigth;
    }

    public int calculateArea() {
        return 0;
    }

    @Override
    public String toString() {
        return
                "length=" + length +
                ", heigth=" + heigth +
                ", area=" + calculateArea();
    }
}
