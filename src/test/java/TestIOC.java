import FoodOrderingService.FoodOrderingService;
import Programmer.Programmer;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestIOC{

    @Test
    public void testHelloWorldPrint() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        HelloWorldPrint.printHelloWorld(ps);
        assertEquals("Hello World\n", baos.toString());
    }

    @Test
    public void testProgrammer() {
        Programmer sam = new Programmer("sam");
        sam.playGame();
        sam.writeCode();
    }

    @Test
    public void testOrderFood() {
        FoodOrderingService fd = new FoodOrderingService();
        fd.order("Peng", "fish biscuit");
        fd.order("Peng", "steak hamburger");
        fd.checkStatus("Peng");
    }
}