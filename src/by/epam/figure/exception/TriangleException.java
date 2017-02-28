package by.epam.figure.exception;

/**
 * Created by Acer on 21.02.2017.
 */
public class TriangleException extends Exception {
    public TriangleException() {
    }
    public TriangleException(String message, Throwable exception) {

        super(message,exception);
    }
    public TriangleException(String message) {

        super(message);
    }
    public TriangleException (Throwable exception) {

        super(exception);
    }
}
