package OOPclass;

public class Product {
    private String name ;
    private int quantity ;
    private double price;
    private int productId;
    private static int idCounter =1;

    public Product(){
        this("unknown",0,0);
    }
    public Product(String name ,int quantity,double price){
        this.name=name;
        this.quantity=quantity;
        this.price =price;
        productId=idCounter;
        idCounter++;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public double getPrice() {
        return price;
    }

    public int getProductId() {
        return productId;
    }
    public double getItemValue(){
        return price*quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {

    }

    public void setPrice(double price) {

    }
    public String toString(){
        return name+"-"+ price;
    }

}
