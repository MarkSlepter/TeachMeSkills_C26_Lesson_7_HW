package Assignment2.Figures;

public class Triangle extends Figure{
    public double side1;
    public double side2;
    public double side3;

    public Triangle(double side1,
                    double side2,
                    double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        double s = ((side1 + side2 + side3)/2);
        return Math.sqrt( s * (s -side1) * (s - side2) * (s * side3));
    }

    @Override
    public double calculatePerimeter() {
        double p = (side1 + side2 + side3);
        return side1 + side2 + side3;
    }

}