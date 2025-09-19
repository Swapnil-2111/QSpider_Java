class PersonId{
    String name;
    int age;
    String address;
    int id=10000;

    private PersonId(String name,String age, String address, int id){
        super();
        this.name=name;
        this.age=age;
        this.address=address;
        this.id=id;
    }

    public void displayPersonId(){
        System.out.println("Personal Details:");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
        System.out.println("Id:"+id);
    }
}


public class Driver {
    public static void main(String[] args) {
        PersonId pid=new PersonId("Swapnil",21,"Mumbai",10000);
    }
}
