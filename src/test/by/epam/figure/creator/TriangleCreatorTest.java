package test.by.epam.figure.creator;

import by.epam.figure.creator.TriangleCreator;
import by.epam.figure.entity.Point;
import by.epam.figure.entity.Triangle;
import by.epam.figure.parser.DataParser;
import by.epam.figure.reader.DataReader;
import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acer on 20.02.2017.
 */

public class TriangleCreatorTest {
    private static TriangleCreator creator;
    private static Point a;
    private static Point b;
    private static Point c;
    private static List<Point> points;
    private Triangle triangle;

    @BeforeClass
    public static void initData(){
        creator = new TriangleCreator();
        a = new Point(1,1);
        b = new Point(4,1);
        c = new Point(1,3);
        points = new ArrayList<>();
        points.add(a);
        points.add(b);
        points.add(c);
    }

    @AfterClass
    public static void clearData(){
        points = null;
        c = null;
        b = null;
        a = null;
        creator = null;
    }

    @Test
    public void createTriangleTest(){
        triangle = creator.createTriangle(points);
        boolean condition = triangle != null;
        Assert.assertTrue(condition);
    }



}
