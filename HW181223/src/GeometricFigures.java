public abstract class GeometricFigures {

    private int sideA;
    private int sideB;
    private double diameter;


    public GeometricFigures(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public GeometricFigures(int side) {
        this.sideA = side;
    }

    public GeometricFigures(double diameter) {
        this.diameter = diameter;
    }

    public abstract void resultOutput();



    public double getDiameter() {
        return diameter;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }



}