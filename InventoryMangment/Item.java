/*
 * Jay Shah
 */
package InventoryMangment;

public class Item {
    private int itm_code;
    private String itm_description;
    private int qty;
    private int min_qty;
    private double cost;

    Item(int itm_code, int qty, int min_qty, int cost) {
        this.itm_code = itm_code;
        this.qty = qty;
        this.min_qty = min_qty;
        this.cost = cost;
    }

    Item(int itm_code, String itm_description, double cost) {
        this.itm_code = itm_code;
        this.itm_description = itm_description;
        this.cost = cost;
    }

    public void addStock(int qty) {
        this.qty += this.qty;
    }

    public int getStock() {
        return this.min_qty;
    }

    public double getCost() {
        return this.cost;
    }

    public int getQty() {
        return this.qty;
    }

    public String getDescription() {
        return this.itm_description;
    }

    public void toSting() {
    }
}
