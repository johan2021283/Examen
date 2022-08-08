package Diagrama;

public class Order {
    private int orderid;
    private String dateCreated;
    private String dateShipped;
    private String customertName;
    private String customerid;
    private String status;
    private String shoppingid;
    private Customer customer;

    public Order(int orderid, String dateCreated, String dateShipped, String customertName, String customerid, String status, String shoppingid) {
        this.orderid = orderid;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customertName = customertName;
        this.customerid = customerid;
        this.status = status;
        this.shoppingid = shoppingid;
    }

    public void placeOrder(){

    }

}
