class Book {
    String title;
    String author;
    double price;

    Book(){
        title="Unknown";
        author="Anonymous";
        price=0.0;
    }

    public void displayInfo() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }

}

public class Example1 {
    public static void main(String[] args) {
        Book obj = new Book();
        // obj.title = "Revolution 2020";
        // obj.author = "Chetan Bhagat";
        // obj.price = 180;
        obj.displayInfo();
    }
}
