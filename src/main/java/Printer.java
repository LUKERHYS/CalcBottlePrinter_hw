public class Printer {

    private int NumberOfSheets;
    private String Error;
    private int TonerVolume;

    public Printer(int NumberOfSheets, int TonerVolume) {
        this.NumberOfSheets = NumberOfSheets;
        this.Error = "Print Failure: Paper tray 1 Too Low";
        this.TonerVolume = TonerVolume;
    }

    public int getSheets() {
        return this.NumberOfSheets;
    }

    public int getToner() {
        return this.TonerVolume;
    }

    public int reduceToner(int pages, int copies) {
        return this.TonerVolume -= (pages * copies);
    }

    public int reducePaper(int pages, int copies) {
        return this.NumberOfSheets -= (pages * copies);
    }

//    public String print(int pages, int copies) {
//        if (this.NumberOfSheets >= (pages * copies) && this.TonerVolume >= this.TonerVolume) {
//            reducePaper(pages, copies);
//            reduceToner(pages, copies);
//            return "Print successful";
//        } else {
//            return "Print Failure: Paper tray 1 Too Low";
//        }
//    }

    public String print(int pages, int copies) {
        if (this.NumberOfSheets <= (pages * copies) || this.TonerVolume <= (pages * copies)) {
            return "Print Failure: Paper tray 1 Too Low";

        } else if (this.NumberOfSheets >= (pages * copies) && this.TonerVolume >= (pages * copies)) {
            reducePaper(pages, copies);
            reduceToner(pages, copies);
            return "Print successful";
        } else {
            return "error";
        }
    }
}
