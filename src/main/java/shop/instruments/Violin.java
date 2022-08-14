package shop.instruments;

public class Violin extends Instruments {

    private int numStrings;

    public Violin(String make, String colour, InstrumentType type, int numStrings) {
        super(make, colour, type);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public String play(){
        return "Plink Plonk";
    }

}
