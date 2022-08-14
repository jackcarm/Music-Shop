package shop.items;

import behaviours.ISell;

public abstract class Items {

    private String make;
    private String model;

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
}
