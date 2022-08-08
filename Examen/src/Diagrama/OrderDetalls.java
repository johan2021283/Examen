package Diagrama;

public class OrderDetalls {
    private int orderid;
    private int productid;
    private String productName;
    private int quantity;
    private float UnitCost;
    private float subTotal;
    private Order order;

    public OrderDetalls(int orderid, int productid, String productName, int quantity, float unitCost, float subTotal) {
        this.orderid = orderid;
        this.productid = productid;
        this.productName = productName;
        this.quantity = quantity;
        UnitCost = unitCost;
        this.subTotal = subTotal;
    }

    public void calcPrice(){

    }
}
