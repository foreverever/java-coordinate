package view;

import domain.Figure;
import domain.Point;

import java.util.List;

public class ResultView {
    public static void printCoordinate(List<Point> pl) {
        CoordinateView.makeCoordinate();
        for (Point point : pl) {
            CoordinateView.drawDot(point.findPointPosition());
        }
        System.out.println(CoordinateView.getCoordinateSb());
    }

    public static void printArea(Figure figure) {
        System.out.println(figure.name() + figure.area());
    }

//    public static void printLineLength(double len) {
//        System.out.println("\n");
//        System.out.println("두 점 사이 거리는 " + String.format("%.6f", len));
//    }
//
//    public static void printRectangleArea(double area) {
//        System.out.println("사각형의 넓이는 " + String.format("%.0f", area));
//    }
//
//    public static void printTriangleArea(double area) {
//        System.out.println("삼각형의 넓이는 " + String.format("%.1f", area));
//    }
}