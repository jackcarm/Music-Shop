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

    @Override
    public double getPurchasePrice() {
        return purchasePrice;
    }

    @Override
    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Override
    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        return (getSellPrice()/getPurchasePrice()) - 1;
    }

}
