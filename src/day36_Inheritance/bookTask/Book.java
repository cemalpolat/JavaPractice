package day36_Inheritance.bookTask;

public class Book {

    public String title, type,author;
    public int price;

    public Book(String title, String type, String author, int price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
/*3.1. create a class named Book:
			variables:
				title, type, author, price

			Methods:
				setInfo()
				toString()

 */