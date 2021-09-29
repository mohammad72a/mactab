package hw8;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Rethrow {
    public static void main(String[] args) throws Exception {

        try {

            Method1();

        } catch (Exception e) {

            System.out.println("Exception thrown in " + e.getStackTrace()[0].getMethodName() + "\n");

            StringWriter sw = new StringWriter();

            e.printStackTrace(new PrintWriter(sw));

            String exceptionAsString = sw.toString();

            String bagBegin = exceptionAsString.substring(0, 19);

            String bagEnd = exceptionAsString.substring(19);

            System.out.println(bagBegin + ": Exception thrown in " + e.getStackTrace()[0].getMethodName() + bagEnd);

        }

    }

    public static void Method1() throws Exception {

        try {

            Method2();

        } catch (Exception e) {

            throw e;

        }

    }

    public static void Method2() throws Exception {

        throw new Exception();

    }
}
