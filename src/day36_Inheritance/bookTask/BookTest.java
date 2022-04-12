package day36_Inheritance.bookTask;

public class BookTest {
    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("Paddington","Fiction","Michael Bond",25,"Small",300);
        AudioBook audiobook1 = new AudioBook("Harry Potter", "Novel","J.Rowling",20,3,"ggggg");

        ebook1.readBook();
        audiobook1.listen();
        System.out.println(ebook1);
        System.out.println(audiobook1);
    }
}
