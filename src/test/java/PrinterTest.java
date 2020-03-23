import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(250);
    }

    @Test
    public void hasSheets(){
        assertEquals(250, printer.getSheets());
    }

    @Test
    public void numberOfSheetsHasReduced(){
        printer.print(2, 2);
        assertEquals(246, printer.getSheets());
    }

    @Test
    public void failedToPrintDueToNoPaper(){
        Printer lowPaperPrinter = new Printer(3);
//        assertEquals("Print Failure: Paper tray 1 Too Low", printer.print(2, 2));
        assertEquals(0, lowPaperPrinter.print(2, 2));
    }
}
