package day36_Inheritance.bookTask;

public class Ebook extends Book{

    public String size;
    public int pages;

    public Ebook(String title, String type, String author, int price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println(title + " is reading");
    }

    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}



/*
3.2 Create a sub class of Book named EBook:
        variables:
        title, type, author, price, size, pages

        Methods:
        setInfo()
        readBook()
        toString()

 */
