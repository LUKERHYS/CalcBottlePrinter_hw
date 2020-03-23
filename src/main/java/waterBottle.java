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

    public int empty(){
        return this.volume = 0;
    }
}
