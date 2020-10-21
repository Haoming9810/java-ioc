import FoodOrderingService.FoodOrderingService;
import Programmer.Hacker;
import Programmer.Mac;
import Programmer.PC;
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

        HelloWorldPrint.printHelloWorld(System.out);
    }

    @Test
    public void testProgrammer() {
        Hacker sam = new Hacker("Sam");
        Mac mac = new Mac("Big Mac");
        PC pc = new PC("Windows PC");
        sam.playGame(mac);
        sam.writeCode(pc);

        sam.playGame(pc);
        sam.writeCode(mac);
    }

    @Test
    public void testOrderFood() {
        // Quiz
        // how to test the logic in FoodOrderingService without relying on SlickDatabase and Disk
        FoodOrderingService fd = new FoodOrderingService();
        fd.order("Peng", "fish biscuit");
        fd.order("Peng", "steak hamburger");
        fd.checkStatus("Peng");
    }
}