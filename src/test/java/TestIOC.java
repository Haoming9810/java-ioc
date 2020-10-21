import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TestIOC{

    @Test
    public void testHelloWorldPrint() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        HelloWorldPrint.printHelloWorld(ps);
        assertEquals("Hello World", baos.toString());
    }

    @Test
    public void testProgrammer() {
        Programmer sam = new Programmer("sam");
        sam.playGame();
        sam.writeCode();
    }
}