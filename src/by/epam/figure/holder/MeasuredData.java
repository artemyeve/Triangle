package by.epam.figure.holder;

import by.epam.figure.action.TriangleAction;
import by.epam.figure.entity.Triangle;

/**
 * Created by Acer on 20.02.2017.
 */
public class MeasuredData {
    private double perimeter;
    private double square;

    public MeasuredData(Triangle triangle){
        perimeter = TriangleAction.calculatePerimeter(triangle.getA(),triangle.getB(),triangle.getC());
        square = TriangleAction.calculateSquare(triangle.getA(),triangle.getB(),triangle.getC());
    }

    public double getPerimеter() {

        return perimeter;
    }

    public double getSquare() {

        return square;
    }

    @Override
    public String toString() {
        return "MeasuredData{" +
                "perimeter=" + perimeter +
                ", square=" + square +
                '}';
    }
}
