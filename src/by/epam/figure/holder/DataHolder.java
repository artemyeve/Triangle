package by.epam.figure.holder;

import by.epam.figure.entity.Triangle;
import by.epam.figure.observer.TriangleObserver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Acer on 19.02.2017.
 */
public class DataHolder implements TriangleObserver {

    private Map<Triangle, MeasuredData> resultData = new HashMap<>();;

    private final static DataHolder INSTANCE = new DataHolder();

    private DataHolder() {
    }

    public static DataHolder getInstance() {
        return INSTANCE;
    }

    @Override
    public void update(Triangle triangle) {

        MeasuredData result = new MeasuredData(triangle);
        resultData.put(triangle, result);

    }

    public Map<Triangle, MeasuredData> getResultData() {

        return resultData;
    }


}
