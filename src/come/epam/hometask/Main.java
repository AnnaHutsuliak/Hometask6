package come.epam.hometask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите значения процента для изменения стоимости книг: ");
        Scanner scan1 = new Scanner(System.in);
        int number_percent = scan1.nextInt();
        System.out.print("Введите год для отбора книги: (2010, 2017 или 2020) ");
        Scanner scan2 = new Scanner(System.in);
        int number_year = scan2.nextInt();
        System.out.println("-------------------------------------------------------");

        System.out.println("Все книги:");
        Books books = new Books();
        books.printBooks ();
        System.out.println("-------------------------------------------------------");

        Books another = new Books();
        another.setBooks(books.searchBooks(number_year));
        System.out.println("Книги, после выбраного года:");
        another.printBooks();

    }
}

