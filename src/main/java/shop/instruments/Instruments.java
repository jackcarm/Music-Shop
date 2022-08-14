package shop.instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instruments implements IPlay, ISell {

    private String make;
    private String colour;
    private InstrumentType type;
    private double purchasePrice;
    private double sellPrice;



    public Instruments(String make, String colour, InstrumentType type) {
        this.make = make;
        this.colour = colour;
        this.type = type;
        this.purchasePrice = 0;
        this.sellPrice = 0;

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


    public double getPurchasePrice() {
        return purchasePrice;
    }


    public double getSellPrice() {
        return sellPrice;
    }


    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }


    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return (getSellPrice()/getPurchasePrice()) - 1;
    }

}
