package hw8;

public class ExceptionA extends Exception {
    public ExceptionA(String message)
    {
        super(message);
    }

    public static void getExceptionA() throws ExceptionA
    {
        throw new ExceptionA("Exception A");
    }
}



