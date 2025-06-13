package practiceQ;

class library{
    String books[];
        int no;
    library(){
        books=new String[100];
        no=0;
    }
    public void addBook(String book){
        books[no]=book;
        no++;
        System.out.println(book+ " has been added!!");

    }
    public void issueBook(String book){
            for(int i = 0;i<books.length;i++){
                if(books[i].equals(book)){
            System.out.println(book+" Book issued");
            books[i]=null;
            return;
        }
    }
        System.out.println("Book not exist");

    }
    public void returnBook(String book){
        addBook(book);


    }
    public void showAvailable()
    {
        System.out.println("Available books:");
        for (String book : books) {
            if(book!= null)
            System.out.println("* "+ book);
            else continue;
        }

    }
}
public class lib {
    public static void main(String[] args) {
        library obj=new library();
        obj.addBook("Maths");
        obj.addBook("DAA");
        obj.addBook("physics");
        obj.addBook("bio");
        obj.showAvailable();
        obj.issueBook("bio");
        obj.showAvailable();
        obj.returnBook("bio");
        obj.showAvailable();


    }
}
