//Processor Class
class Processor{
    String generation;
    int ram;
    double clockspeed;
    String name;

    Processor(){
        super();
    }

    Processor(String generation, int ram, double clockspeed, String name){
        super();
        this.generation=generation;
        this.ram=ram;
        this.clockspeed=clockspeed;
        this.name=name;
    }

    Processor (Processor processor){
        super();
        this.generation=processor.generation;
        this.ram=processor.ram;
        this.clockspeed=processor.clockspeed;
        this.name=processor.name;
    }

    public void displayProcessor(){
        System.out.println("\n Processor Details:");
        System.out.println("Generation:"+generation);
        System.out.println("Ram:"+ram);
        System.out.println("Clock Speed:"+clockspeed);
        System.out.println("Name:"+name);
    }
}

class Mobile extends Processor{
    String brand;
    String model;
    double price;
    Processor processor;

    Mobile(){
        super();
    }

    Mobile(String brand, String model, double price, Processor processor){
        super();
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.processor=processor; 
    }

    Mobile(Mobile mobile){
        super();
        this.brand=mobile.brand;
        this.model=mobile.model;
        this.price=mobile.price;
        this.processor=mobile.processor;
    }

    public void displayMobile(){
        System.out.println("\n Mobile Details:");
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
        processor.displayProcessor();
    }
}



public class Driver {
     public static void main(String[] args) {
        Processor processor = new Processor("A19", 8, 4.04, "Bionic");
        Mobile mobile = new Mobile("Apple", "17Air", 129000.51, processor);
        mobile.displayMobile();

        System.out.println("\n Created a COPY");

        Mobile newMobile=new Mobile(mobile);
        newMobile.displayMobile();

        newMobile.brand="Samsung";

        System.out.println("\n Copy after changes are made:");
        System.out.println("\n  New copy");
        newMobile.displayMobile();

        System.out.println("\n Old copy");
        mobile.displayMobile();
    }
}
