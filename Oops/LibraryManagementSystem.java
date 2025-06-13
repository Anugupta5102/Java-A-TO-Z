package Oops;

import java.util.ArrayList;
// Assume that all the users are registered with their names in the central database

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added to the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned");
        this.books.add(b);
    }

}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("DSA", "CLRS");
        bk.add(b1);

        Book b2 = new Book("RTS", "CLRS2");
        bk.add(b2);

        Book b3 = new Book("CN", "CLRS3");
        bk.add(b3);

        Book b4 = new Book("DAA", "CLRS4");
        bk.add(b4);
        MyLibrary l = new MyLibrary(bk);
        l.addBook(new Book("DBMS", "myAuthor"));
        System.out.println(l.books);
        l.issueBook(b3, "Anu");
        System.out.println(l.books);

    }
}
