package OverloadBooks;



import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> book = new ArrayList<>();

        Books book1 = new Books("The Great Gatsby", 180, 1925,"Scott Fitzgerald", "Scribner",9.99);
        book.add(book1);

        Books book2 = new Books("1984", 328, 1949, "George Orwell", "Secker & Warburg", 12.99);
        book.add(book2);

        Books book3 = new Books("The Catcher in the Rye", 234, 1951, "J.D. Salinger", "Little, Brown and Company", 9.99);
        book.add(book3);

        while (true) {
            System.out.print("Enter the title of the book: ");
            String title = scanner.nextLine();
            if (title.equals("")) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the author: ");
            String author = scanner.nextLine();

            System.out.print("Enter the publisher: ");
            String publisher = scanner.nextLine();

            System.out.print("Enter the price: ");
            double price = Double.parseDouble(scanner.nextLine());

            Books bookInput = new Books(title, pages, publicationYear, author, publisher, price);
            book.add(bookInput);
        }

        System.out.print("What information will be printed: titles or everything? ");
        String info = scanner.nextLine();
        if (info.equals("everything")) {
            for (Books bookInput : book) {
                System.out.println(bookInput);
            }
        } else if (info.equals("titles")) {
            for (Books bookInput : book) {
                System.out.println(bookInput.getTitle());
            }
        }
    }
}
