package domain;

import java.util.List;
import java.util.Objects;

import static domain.FigureUtil.isTriangle;
import static java.lang.Math.sqrt;

public class Triangle extends Figure {

    private double area;

    private Triangle(List<String> coordinates) {
        super(Points.initCoordinates(coordinates));
    }

    public static Triangle of(List<String> coordinates) {
        if (!isTriangle(coordinates)) {
            throw new RuntimeException();
        }
        return new Triangle(coordinates);
    }

    public double getArea() {
        return area;
    }

    public void calculate() {
        double a = calculateLine(0, 1);
        double b = calculateLine(0, 2);
        double c = calculateLine(1, 2);
        double s = (a + b + c) / 2;
        area = sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}