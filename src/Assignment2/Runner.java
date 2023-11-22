package Assignment2;

import Assignment2.Figures.Circle;
import Assignment2.Figures.Figure;
import Assignment2.Figures.Rectangle;
import Assignment2.Figures.Triangle;

public class Runner {

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(13.2);
        figures[1] = new Triangle(4, 3, 88);
        figures[2] = new Triangle(5.6, 2.8, 11.3);
        figures[3] = new Rectangle(33, 66);
        figures[4] = new Rectangle(55.4, 6.9);
        double totalPerimeter = 0;

        for (Figure figure : figures){
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
            System.out.println();
            totalPerimeter += figure.calculatePerimeter();
        }

        System.out.println("Total Perimeter of all shapes: " + totalPerimeter);
    }

}
