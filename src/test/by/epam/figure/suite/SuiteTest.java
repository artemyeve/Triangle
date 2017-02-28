package test.by.epam.figure.suite;

/**
 * Created by Acer on 28.02.2017.
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.by.epam.figure.action.TriangleActionTest;
import test.by.epam.figure.creator.TriangleCreatorTest;
import test.by.epam.figure.exception.TriangleExceptionTest;
import test.by.epam.figure.holder.DataHolderTest;
import test.by.epam.figure.logic.TriangleLogicTest;
import test.by.epam.figure.reader.DataReaderTest;

@Suite.SuiteClasses({
        TriangleActionTest.class,
        TriangleLogicTest.class,
        TriangleExceptionTest.class,
        DataReaderTest.class,
        DataHolderTest.class,
        TriangleCreatorTest.class,

})
@RunWith(Suite.class)
public class SuiteTest {

}
