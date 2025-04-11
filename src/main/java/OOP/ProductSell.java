package OOP;

public class ProductSell {
    // in depth concept of constructor
    public  int vat;
    ProductSell(int vat){
        this.vat = vat;
    }
    public  int sellitem(int itemCount, int price){
        return (price+(itemCount*price)*vat/100);

    }

    public static void main(String[] args) {
        ProductSell productSell = new ProductSell(15);
      int price = productSell.sellitem(1, 100);
        System.out.println(price);

        // static = there is no object of the class
        // no static = there is object of the class
    }

}
