class Vehicle{
    String brand;
    String model;
    double price;

    Vehicle(String brand, String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    Vehicle(String brand, String model){
        this(brand, model, 0.0);
    }
    public void displayDetails(){
        System.out.println("Vehicle Brand:"+brand);
        System.out.println("Vehicle Model:"+model);
        System.out.println("Vehicle Price:"+price);
    }

}

class Car extends Vehicle{
    int seatingCapacity;

    Car(String brand, String model, double price,int seatingCapacity){
        super(brand,model,price);
        this.seatingCapacity=seatingCapacity;
    }

    Car(String brand, String model,int seatingCapacity){
        super(brand , model);
        this.seatingCapacity=seatingCapacity;
    }
    

    @Override
    public void displayDetails() {
        
        super.displayDetails();
        System.out.println("Car Seating Capacity:"+seatingCapacity);
    }
}

public class Driver {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes Benz", "S-Class", 2100000, 4);
        Car c2 = new Car("Audi", "Q7", 4);
        c1.displayDetails();
        System.out.println("---------------");
        c2.displayDetails();
    }   
}
