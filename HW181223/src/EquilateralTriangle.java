public class EquilateralTriangle extends GeometricFigures {

    private int s=getSideA();

    EquilateralTriangle(int sideA) {
        super(sideA);
    }


    private double countPerimeter() {
        return s + s + s;
    }

    private double countArea() {
        double p = countPerimeter() / 2.0;
        return Math.sqrt(p * (p - s) * (p - s) * (p - s));
    }

    public String toString() {
        return "Equilateral Triangle perimeter is: " + countPerimeter() + "cm.\nArea: " + countArea() + "cm²";
    }

    public void resultOutput() {
        System.out.println("Equilateral Triangle: " + countPerimeter() + "cm, area: " + countArea() + "cm²\n");
    }

}