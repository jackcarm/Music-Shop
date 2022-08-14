package shop.items;

import behaviours.ISell;

public abstract class Items implements ISell {

    private String make;
    private String model;
    private double purchasePrice;
    private double sellPrice;

    public Items(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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
