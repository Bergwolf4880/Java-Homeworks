public class Main {
    public static void main(String[] args) {

        GeometricFigures[] figures = {new Circle(20),
                new Square(5),
                new Rectangle(5, 8),
                new EquilateralTriangle(3)};




        for (GeometricFigures result : figures) {

            //result.resultOutput();
            System.out.println(result.toString());


        }
    }
}