import java.io.PrintStream;

public class HelloWorldPrint {
    /*
     this is not testable
     */
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    /*
     this is testable
     */
    public static void printHelloWorld(PrintStream print) {
        print.println("Hello World");
    }
}
