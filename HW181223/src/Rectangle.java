public class Rectangle extends GeometricFigures {

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);

    }

    public int countPerimeter() {
        return (getSideA() * 2) + (getSideB() * 2);
    }

    public int countArea() {
        return getSideA() * getSideB();
    }

    public String toString() {
        return "Rectangle perimeter: " + countPerimeter() + "cm.\nArea: " + countArea() + "cm²";
    }

    public void resultOutput() {
        System.out.println("Rectangle perimeter: " + countPerimeter() + "cm, area: " + countArea() + "cm²\n");
    }
}