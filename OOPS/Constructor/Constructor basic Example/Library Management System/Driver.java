class Book{
    String title;
    String author;
    double price;

    Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void displayDetails(){
        System.out.println("Book Title:"+title);
        System.out.println("Book Author:"+author);
        System.out.println("Book Price:"+price);
    }
}

class TextBook extends Book{
    String subject;
    TextBook(String title, String author, double price,String subject){
        super(title, author, price);
        this.subject=subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("TextBook Subject:"+subject);
    }
}

class Novel extends Book{
    String genre;
    Novel(String title, String author, double price,String genre){
        super(title, author, price);
        this.genre=genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Novel Genre:"+genre);
    }
}

public class Driver {
    public static void main(String[] args) {
        Book b1=new Book("Revolution 2020", "Chetan Bhagat");
        Book b2=new Book("Five Love Languages", "Gray Chapman", 221.75);
        TextBook t1=new TextBook("who moved my cheese", "Spencer Johnson", 51, "Move ON");
        Novel n1= new Novel("The Secret", "Rhonda Bryne", 211, "Self Development");
        b1.displayDetails();
        System.out.println("------------");
        b2.displayDetails();
        System.out.println("------------");
        t1.displayDetails();
        System.out.println("------------");
        n1.displayDetails();
    }
}
