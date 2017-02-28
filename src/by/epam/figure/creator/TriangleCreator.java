package by.epam.figure.creator;

import by.epam.figure.entity.Point;
import by.epam.figure.entity.Triangle;


import java.util.List;


/**
 * Created by Acer on 20.02.2017.
 */
public class TriangleCreator {


    public Triangle createTriangle(List<Point> points) {
        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);
        Triangle triangle = new Triangle(a, b, c);
        return triangle;

    }
}
