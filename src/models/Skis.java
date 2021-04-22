/*Name          : Akshit Deswal
Student NUmber : 200454399
 */
package models;

import Utilities.DBUtility;

public class Skis extends InventoryItem{
    private String brand, model;
    private int length;

    public Skis(String brand, String model, int length,double purchasePrice, double sellingPrice, int quantityInStock) {
        super(purchasePrice, sellingPrice,quantityInStock);
        setBrand(brand);
        setModel(model);
        setLength(length);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 220 && length >= 60){
            this.length = length;
        }
        else {
            throw new IllegalArgumentException("Invalid, length should be in between 60-220 inclusive.");
        }
    }
}
