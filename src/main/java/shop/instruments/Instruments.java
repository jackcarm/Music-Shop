package shop.instruments;

import behaviours.IPlay;

public abstract class Instruments implements IPlay {

    private String make;
    private String colour;
    private InstrumentType type;



    public Instruments(String make, String colour, InstrumentType type) {
        this.make = make;
        this.colour = colour;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }




}
