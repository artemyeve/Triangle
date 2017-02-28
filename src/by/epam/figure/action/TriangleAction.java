/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.figure.action;

import by.epam.figure.entity.Point;

public class TriangleAction {

    public static double calculateLength(Point p1, Point p2) {

        return Math.hypot((p1.getX() - p2.getX()), (p1.getY() - p2.getY()));
    }

    public static double calculatePerimeter(Point a, Point b, Point c) {

        return calculateLength(a, b) + calculateLength(b, c) + calculateLength(a, c);
    }

    public static double calculateSquare(Point a, Point b, Point c) {

        double semiPerimeter = calculatePerimeter(a, b, c) / 2.0;
        double ab = calculateLength(a, b);
        double bc = calculateLength(b, c);
        double ac = calculateLength(a, c);
        return Math.sqrt(semiPerimeter * (semiPerimeter - ab) * (semiPerimeter - bc) * (semiPerimeter - ac));
    }

}
