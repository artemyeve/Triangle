package by.epam.figure.parser;

import by.epam.figure.entity.Point;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Acer on 19.02.2017.
 */
public class DataParser {
    private static Logger logger = LogManager.getLogger(DataParser.class);
    private static final Pattern PATTERN = Pattern.compile("(\\d)+||(\\d+(//.)\\d+)||((-)(\\d)+)|((-)(\\d+(//.)\\d+))");
    private static final int NUM_COORD = 6;

    public static List<String> getCoordinates(List<String> fileData) {
        List<String> coordinates = new ArrayList<>();
        Matcher matcher;
        String[] strings;

        for (String line : fileData) {
            int count = 0;
            strings = line.trim().split("\\s+");
            if (strings.length == NUM_COORD) {
                for (String singleNumber : strings) {
                    matcher = PATTERN.matcher(singleNumber);
                    if (matcher.find()) {
                        count++;
                    }
                }
                if (count == NUM_COORD) {
                    coordinates.add(line);
                }
            }
        }
        logger.log(Level.INFO, "Correct coordinates");
        return coordinates;
    }

    public static List<Point> createPoints(List<String> coordinates) {
        List<Point> points = new ArrayList<>();
        if (!coordinates.isEmpty()) {
            int firstLine = 0;
            String line = coordinates.remove(firstLine);
            Scanner scanner = new Scanner(line);
            while (scanner.hasNextDouble()) {
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                points.add(new Point(x, y));
            }
        } else {
            logger.log(Level.INFO, "Coordinates are not found");
        }
        return points;
    }

}


