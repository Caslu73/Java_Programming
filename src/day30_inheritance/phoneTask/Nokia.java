package day30_inheritance.phoneTask;

public class Nokia extends phone{
    public Nokia(String model, String size, double price, String color) {
        super("Nokia",model, size, price, color);
    }

    public void selfDefense(){
        System.out.println(getBrand()+" "+getModel()+" can be used for self defense");
    }
}

/*
extra methods

selfDefense()
 */