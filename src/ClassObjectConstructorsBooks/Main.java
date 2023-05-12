package ClassObjectConstructorsBooks;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("The Great Gatsby", 180, 1925);
        books.add(book1);

        Book book2 = new Book("1984", 328, 1949);
        books.add(book2);

        Book book3 = new Book("The Catcher in the Rye", 234, 1951);
        books.add(book3);

        while (true) {
            System.out.print("Enter the title of the book: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the publication year: ");
            int publicationYear = scanner.nextInt();
            scanner.nextLine();

            Book book = new Book(title, pages, publicationYear);
            books.add(book);
        }

        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();
        if (info.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        } else if (info.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
