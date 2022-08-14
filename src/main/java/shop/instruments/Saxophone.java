package shop.instruments;

public class Saxophone extends Instruments{

    private int numValves;

    public Saxophone(String make, String colour, InstrumentType type, int numValves) {
        super(make, colour, type);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }

    public String play(){
        return "Jazzy Jazz";
    }


}
