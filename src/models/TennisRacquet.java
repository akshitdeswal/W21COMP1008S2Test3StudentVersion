/*Name          : Akshit Deswal
Student NUmber  : 200454399
 */
package models;

import Utilities.DBUtility;

import java.util.List;

public class TennisRacquet  extends InventoryItem{
    private double weight;  //240-310
    private String headSize; //midsize, midplus, oversize, super oversize
    private String brand; //Head, Babolat, Dunlop, Yonex
    private String model;

    public TennisRacquet(String brand, String model, double weight, String headSize, double purchasePrice, double sellingPrice, int quantityInStock) {
        super(purchasePrice, sellingPrice,quantityInStock);
        setBrand(brand);
        setModel(model);
        setWeight(weight);
        setHeadSize(headSize);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight <= 310 && weight >= 240){
            this.weight = weight;
        }
        else {
            throw new IllegalArgumentException("Invalid Input, Weight Should be in between 240-310 (inclusive)");
        }
    }

    public String getHeadSize() {
        return headSize;
    }

    public void setHeadSize(String headSize) {
        headSize = headSize.toLowerCase();
        List<String> validSizes = DBUtility.getTennisRacquetHeadSizes();
        if(validSizes.contains(headSize)){
            this.headSize = headSize;
        }
        else{
            throw new IllegalArgumentException( headSize + " is invalid please choose from valid options" + validSizes);
        }


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
}
