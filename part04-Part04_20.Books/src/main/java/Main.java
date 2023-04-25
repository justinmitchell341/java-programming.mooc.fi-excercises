import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String title = "";
        int pages = 0;
        int pubYear = 0;
        while(true){
            System.out.println("Title: ");
            title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            pubYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, pages, pubYear));
        }
        System.out.println("What information will be printed? ");
        String choice = scanner.nextLine();
        if(choice.equals("everything")){
            for(Book myBook: books){
                System.out.println(myBook.getTitle() + ", " + myBook.getPages() + " pages, " + myBook.getYear());
            }
        }
        if(choice.equals("name")){
             for(Book myBook: books){
                 System.out.println(myBook.getTitle());
             }
         }
        }
    }

