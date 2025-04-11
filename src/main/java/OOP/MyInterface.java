package OOP;

public class MyInterface {
    public static void main(String[] args) {
        Interface rectangle = new Rectangle();
        rectangle.drawShape();

        Interface circle = new Circle();
        circle.drawShape();
    }
}

interface Interface{
    void drawShape();
}
class Rectangle implements Interface{
    public void drawShape(){
        System.out.println("Drawing rectangle");
    }
}

class Circle implements Interface{
    public void drawShape() {
        System.out.println("Drawing circle");


    }
}