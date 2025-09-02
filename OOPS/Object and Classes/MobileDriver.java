class MobileObject {
    //Data-members
    String brand;
    String model;
    String color;
    String processor;
    int storage;
    int ram;
    double screensize;
    double weight;
    double price;

    public void displayMobileInfo(){
        System.out.printf("\n Mobile Info");
        System.out.printf("Brand: %s%n",brand);
        System.out.printf("Model:%s%n",model);
        System.out.printf("Price:%frs%n",price);
        System.out.printf("Storage:%d gb %n Color: %s %n",storage,color);
        System.out.printf("Processor: %s %n Ram: %d %n",processor,ram);
        System.out.printf("ScreenSize:%f inch %n weight:%f grams",screensize,weight);
    }
}

public class MobileDriver{
    public static void main(String[] args) {
        MobileObject obj=new MobileObject();
        obj.brand="SAMSUNG";
        obj.model="S25 ULTRA";
        obj.price=130000;
        obj.storage=1024;
        obj.color="BLACK";
        obj.processor="SNAP DRAGON";
        obj.ram=12;
        obj.screensize=7.8;
        obj.weight=210;
        obj.displayMobileInfo();
    }
}