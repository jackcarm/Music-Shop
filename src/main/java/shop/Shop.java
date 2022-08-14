package shop;

import behaviours.ISell;
import shop.instruments.Guitar;
import shop.instruments.Saxophone;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock.size();
    }


    public void addToStock(ISell ... items) {
        for(ISell item : items){
            stock.add(item);
        }
    }

    public void removeFromStock(ISell ... items) {
        for(ISell item : items) {
            stock.remove(item);
        }
    }
}
