import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 200);

    }

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getPaper());

    }

    @Test
    public void hasToner(){
        assertEquals(200, printer.getToner());
    }

    @Test
    public void CanPrint(){
        printer.print(10, 3);
        assertEquals(70, printer.getPaper());

    }

    @Test
    public void shouldNotPrintWhenNotEnoughPaper(){
        printer.print(50, 10);
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void shouldReduceTonerWhenPrinting(){
        printer.print(2, 1);
        assertEquals(198, printer.getToner());
    }




}
