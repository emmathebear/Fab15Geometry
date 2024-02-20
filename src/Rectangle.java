public class Rectangle extends Shape{
private int length,heigth;

    public Rectangle(int length, int heigth) {
        this.length = length;
        this.heigth = heigth;
    }

    public int calculateArea(){
        return length * heigth;
    }
}

