package come.epam.hometask;
import java.util.Scanner;

public class Main {
    System.out.println("Все книги:");
         Book[] books = new Book[]{
                new Book(101, "Java", "Ivanhoe", "Kiev",
                        2010, 700, 250),
                new Book(102, "PHP", "Ivanhoe", "London",
                        2017, 250, 200),
                new Book(103, "JavaScript", "Ivanov", "New York",
                        2012, 280, 400),
                new Book(104, "C#", "Kolesnik", "Berlin",
                        2013, 450, 500),
                new Book(105, "SQL", "Davidova", "Milan",
                        2019, 300, 700),
                new Book(106, "C++", "Kovalov", "Lviv",
                        2020, 500, 350)};
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
