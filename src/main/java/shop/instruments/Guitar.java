package shop.instruments;


public class Guitar extends Instruments {

    private int numStrings;

    public Guitar(String make, String colour, InstrumentType type, int numStrings) {
        super(make, colour, type);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String play(){
        return "Strum strum";
    }
}
