package day36_Inheritance.bookTask;

public class AudioBook extends Book{

    public int length;
    public String narrator;

    public AudioBook(String title, String type, String author, int price, int length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println(title + " is listenig");
    }

    public String toString() {
        return "AudioBook{" +
                "length=" + length +
                ", narrator='" + narrator + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
3.3 Create a sub class of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */