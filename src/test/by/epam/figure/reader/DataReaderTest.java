package test.by.epam.figure.reader;

import by.epam.figure.reader.DataReader;
import org.junit.*;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by Acer on 27.02.2017.
 */
public class DataReaderTest {
    private File testFile;
    private FileWriter fw;
    private String original;

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Before
    public void createFile() {
        original = "3.4 5.6 6.4 3.3 2.1 4.4";
        try {
            tempFolder.create();
            testFile = tempFolder.newFile("test.txt");
            fw = new FileWriter(testFile);
            fw.write(original);
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void readFileTest() throws IOException {
        List<String> list = DataReader.readFile(testFile.getPath());
        String actual = list.get(0);
        Assert.assertEquals(original, actual);
    }
}
