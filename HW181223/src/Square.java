public class Square extends GeometricFigures {

    public Square(int sideA) {
        super(sideA);
    }
    private int countPerimeter() {
        return (getSideA()*2)+(getSideB()*2);
    }
    private int countArea(){
        return (getSideA()*getSideA());
    }

    public String toString() {
        return "Square perimeter: " + countPerimeter() + "cm.\nArea: " + countArea() + "cm²";
    }
    public void resultOutput(){
        System.out.println("Square perimeter: " + countPerimeter() + "cm, area: " + countArea() + "cm²\n");
    }
}
