package test.by.epam.figure.holder;

import by.epam.figure.creator.TriangleCreator;
import by.epam.figure.entity.Point;
import by.epam.figure.entity.Triangle;
import by.epam.figure.holder.DataHolder;
import by.epam.figure.holder.MeasuredData;
import by.epam.figure.parser.DataParser;
import by.epam.figure.reader.DataReader;
import org.junit.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Acer on 26.02.2017.
 */

public class DataHolderTest {
    private static Point a;
    private static Point b;
    private static Point c;
    private static Triangle triangle;

    @BeforeClass
    public static void initData() {
        a = new Point(1.0, 1.0);
        b = new Point(4.0,1.0);
        c = new Point(1.0,3.0);
        triangle =  new Triangle(a,b,c);
    }

    @AfterClass
    public static void clearData(){
        triangle = null;
        c = null;
        b = null;
        a = null;
    }

    @Test
    public void storageTest() {
        DataHolder instance = DataHolder.getInstance();
        instance.update(triangle);
        boolean condition = !instance.getResultData().isEmpty();
        Assert.assertTrue(condition);
    }

}
