
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;




public class Book {

    private String name, author;
    private int cost, pages;

    private Map<Reader, Integer> bookMarks = new HashMap<>();
    
    Book(){}

    Book(String name, String author, int cost, int page){
        this.author = author;
        this.cost = cost;
        this.name = name;
        this.pages = page;
    }
    
    void readBook(Reader reader){
        int currentPage = 1;
        if(bookMarks.containsKey(reader)){
            currentPage = bookMarks.get(reader);
        }

        System.out.println("Reading "+ name +" from page number " + currentPage);

        Scanner sc = new Scanner(System.in);

        while(true){
            
            int userInput = sc.nextInt();
            boolean flag = false;
            switch (userInput) {
                case 1:
                    currentPage++;
                    System.out.println("Reading "+ name +" from page number " + currentPage);
                    break;
                case 2:
                    currentPage = 45;
                    System.out.println("Reading "+ name +" from page number " + currentPage);
                    break;
                case 3:
                    flag = true;
                    break;
                default:
                    break;
            }

            if(flag){
                System.out.println("saved Bookmark on " + currentPage+ " for "+ name);
                bookMarks.put(reader, currentPage);
                break;
            }
        }
    }


    public static void main(String [] args){
        Reader reader = new Reader("Ankit");
        Book book1 = new Book("Physics","aman", 500, 1000);
        Book book2 = new Book("Chemistry","shubham", 500, 1000);

        reader.addBook(book1);
        reader.addBook(book2); 

        reader.readBook(new Book());
        reader.readBook(book2);
        reader.readBook(book1);
        reader.readBook(book2);

    }

}


class Reader{
    private String name;
    private List<Book> bookList;

    Reader(){}

    Reader(String name){
        this.name = name;
        bookList = new ArrayList<>();
    }

    void addBook(Book book){
        bookList.add(book);
    }

    List<Book> showBooks(){
        return bookList;
    }

    void readBook(Book book){
        if(bookList.contains(book)){
            book.readBook(this);
        }else{
            System.out.println("No such book found");
        }
    }
}






