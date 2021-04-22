/*Name          : Akshit Deswal
Student NUmber  : 200454399
 */
package models;

public abstract class InventoryItem {

    private int quantityInStock, quantitySold;
    private double purchasePrice, sellingPrice;

    public InventoryItem(double purchasePrice, double sellingPrice, int quantityInStock)
    {
        setPurchasePrice(purchasePrice);
        setSellingPrice(sellingPrice);
        setQuantityInStock(quantityInStock);
        setQuantitySold(0);
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0){
            this.quantityInStock = quantityInStock;
        }
        else {
            throw new IllegalArgumentException("Quantity Invalid, cant be negative");
        }
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
//        if(quantitySold > getQuantityInStock()){
//
//            throw new IllegalArgumentException("quantitySold should be less than or equal to quantityInStock");
//
//        }
//        quantitySold = getQuantitySold()+quantitySold;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if (purchasePrice >=0)
        {
            this.purchasePrice = purchasePrice;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Purchase Prize, cannot be negative");
        }
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        if (sellingPrice > purchasePrice)
        {
            this.sellingPrice = sellingPrice;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Selling Prize, cannot be less than purchasePrice No profit.");
        }
    }

    public double getProfit()
    {
        return -1;
    }
}
