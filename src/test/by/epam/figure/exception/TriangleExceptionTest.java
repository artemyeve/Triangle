package test.by.epam.figure.exception;

import by.epam.figure.entity.Point;
import by.epam.figure.exception.TriangleException;
import by.epam.figure.logic.TriangleLogic;
import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by Acer on 28.02.2017.
 */
public class TriangleExceptionTest {
    private static Point a;
    private static Point b;
    private static Point c;


    @BeforeClass
    public static void initTriangle() {
        a = new Point(1, 1);
        b = new Point(1, 4);
        c = new Point(1, 7);

    }

    @AfterClass
    public static void clearTriangle() {

        a = null;
        b = null;
        c = null;
    }
      @Test(expected = TriangleException.class)
    public void isNotTriangleTest() throws TriangleException {
        TriangleLogic.checkIsTriangle(a, b, c);
    }
}
