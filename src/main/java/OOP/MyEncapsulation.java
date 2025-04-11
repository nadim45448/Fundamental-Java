package OOP;

public class MyEncapsulation {
    public static void main(String[] args) {
//        Shirt shirt = new Shirt();
//        System.out.println(shirt.price(1, 2500));

        Pant pant = new Pant();
        System.out.println(pant.price(2, 2900));
    }
}

class Shirt{
    private String color;
    private  String brand;
    private String size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String price(int item, int price){
        color = "Blue";
        brand = "Sailor";
        size = "Xl";

        return color+ " "+ brand +" "+ size+" "+(item*price);
    }
}

class Pant extends Shirt {
    public String price(int item, int price){
        setBrand("Richman");
        setSize("Xl");
        setColor("White");
        return getColor()+ " "+ getBrand() +" "+ getSize()+" "+(item*price);
    }


}