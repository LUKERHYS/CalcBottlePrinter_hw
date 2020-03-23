import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(250, 100);
    }

    @Test
    public void hasSheets(){
        assertEquals(250, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void numberOfSheetsHasReduced(){
        printer.print(2, 2);
        assertEquals(246, printer.getSheets());
    }

    @Test
    public void tonerVolumeReduced(){
        printer.print(2, 2);
        assertEquals(96, printer.getToner());
    }

    @Test
    public void successfullPrint(){
        assertEquals("Print successful", printer.print(2, 2));
        assertEquals(96, printer.getToner());
        assertEquals(246, printer.getSheets());
    }

    @Test
    public void failedToPrintLowPaper(){
        Printer lowPaperPrinter = new Printer(3, 100);
        assertEquals("Print Failure: Paper tray 1 Too Low", printer.print(2, 2));
    }
}
