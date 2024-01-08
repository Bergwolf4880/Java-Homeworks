public class Circle extends GeometricFigures {

    public Circle(double diameter) {
        super(diameter);
    }


    private double countArea() {
        return Math.PI * ((getDiameter() / 2) * (getDiameter() / 2));
    }

    private double countPerimeter() {
        return Math.PI * getDiameter();
    }

    public String toString() {
        return "Circle perimeter: " + countPerimeter() + "cm.\nArea: " + countArea() + "cm²";
    }

    public void resultOutput() {
        System.out.println("Circle perimeter: " + countPerimeter() + "cm, area: " + countArea() + "cm²\n");
    }
}
