package by.epam.figure.reader;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by Acer on 19.02.2017.
 */
public class DataReader {
    private static Logger logger = LogManager.getLogger(DataReader.class);

    public static List<String> readFile(String path) throws IOException {

        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get(path), Charset.forName("UTF-8"));

        } catch (IOException ex) {
            logger.log(Level.FATAL, "Input error",ex);
        }

        return lines;
    }

}
