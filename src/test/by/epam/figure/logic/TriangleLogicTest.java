/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.by.epam.figure.logic;

import by.epam.figure.entity.Point;
import by.epam.figure.exception.TriangleException;
import by.epam.figure.logic.TriangleLogic;
import junit.framework.Assert;
import org.junit.*;

/**
 * @author Acer
 */
public class TriangleLogicTest {
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
    public void checkIsTriangleTest() throws TriangleException {
        boolean condition = TriangleLogic.checkIsTriangle(a, b, c);
        Assert.assertTrue(condition);

    }

    @Test
    public void checkRightTriangleTest() {
        boolean condition = TriangleLogic.checkRightTriangle(a, b, c);
        Assert.assertTrue(condition);
    }

}
