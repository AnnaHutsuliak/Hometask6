package come.epam.hometask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Все книги:");
        Books books = new Books();
        books.printBooks();
        System.out.println("-------------------------------------------------------");

        System.out.print("Введите год для отбора книги: ");
        Scanner scan1 = new Scanner(System.in);
        int number_year = scan1.nextInt();
        System.out.println("-------------------------------------------------------");

        Books booksNumber_year = new Books();
        booksNumber_year.setBooks(books.searchBooks(number_year));
        System.out.println("Книги, после выбраного года: ");
        booksNumber_year.printBooks();

        System.out.print("Введите автора :");
        Scanner scan2 = new Scanner(System.in);
        String author = scan2.nextLine();
        System.out.println("-------------------------------------------------------");
        Books booksAuthor = new Books();
        booksAuthor.setBooks(books.searchAuthor(author));
        booksAuthor.printBooks();


        System.out.print("Введите значения процента для изменения стоимости книг: ");
        Scanner scan3 = new Scanner(System.in);
        int number_percent = scan3.nextInt();
        System.out.println("-------------------------------------------------------");
        System.out.println("Книги, стоимость которых увеличена на: " + number_percent + " % :");
        books.revaluation(number_percent);
        books.printBooks();


    }
}
