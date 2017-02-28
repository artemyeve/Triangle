/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.by.epam.figure.action;

import by.epam.figure.action.TriangleAction;
import by.epam.figure.entity.Point;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Acer
 */
public class TriangleActionTest {
    private static Point a;
    private static Point b;
    private static Point c;


    @BeforeClass
    public static void initTriangle() {
        a = new Point(1, 1);
        b = new Point(1, 4);
        c = new Point(5, 1);

    }

    @AfterClass
    public static void clearTriangle() {

        a = null;
        b = null;
        c = null;
    }

    @Test
    public void calculateLengthTest() {
        double expected = 3.0;
        double actual = TriangleAction.calculateLength(a, b);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculatePerimeterTest() {
        double expected = 12.0;
        double actual = TriangleAction.calculatePerimeter(a, b, c);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void calculateSquareTest() {
        double expected = 6.0;
        double actual = TriangleAction.calculateSquare(a, b, c);
        assertEquals(expected, actual, 0.01);
    }

}
