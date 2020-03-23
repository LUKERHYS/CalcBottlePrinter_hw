public class Printer {

    private int NumberOfSheets;

    public Printer(int NumberOfSheets) {
        this.NumberOfSheets = NumberOfSheets;
    }

    public int getSheets(){
        return this.NumberOfSheets;
    }

    public int print(int pages, int copies){
        return this.NumberOfSheets -= (pages * copies);
    }
}
