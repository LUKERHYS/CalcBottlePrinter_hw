public class Printer {

    private int NumberOfSheets;

    public Printer(int NumberOfSheets) {
        this.NumberOfSheets = NumberOfSheets;
    }

    public int getSheets(){
        return this.NumberOfSheets;
    }

    public int print(int pages, int copies) {
        if(this.NumberOfSheets >= (pages * copies)) {
            return this.NumberOfSheets -= (pages * copies);
        } else {
//            return toString("Print Failure: Paper tray 1 Too Low");
            return 0;
        }
    }
}
