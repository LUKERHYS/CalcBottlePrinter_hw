public class waterBottle {

    private int volume;

    public waterBottle(){
        this.volume = 100;
    }


    public int getVolume(){
        return this.volume;
    }

    public int drink(){
        return this.volume -= 10;
    }
}
