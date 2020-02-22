package come.epam.hometask;
import java.util.Arrays;

public class Books {
    private Book[] books;
    public Book[] getBooks() { return books; }
    public void setBooks(Book[] books) { this.books = books; }

    public void printBooks() {
        for (Book elem : books) {
            elem.viewBook();
        }
    }

    public Book[] searchBooks(int number_year) {
        Book[] booksUn = new Book[books.length];
        int i = 0;
        for (Book elem : books) {
            if ((elem.getYear_of_publication() >= number_year)) {
                booksUn[i] = elem;
                i++;
            }
        }
        if (i == 0) {
            System.out.println("Указанного года не найдено");
        }
        return Arrays.copyOf(booksUn, i);
    }

    public Book[] searchAuthor(String author) {
        Book[] booksAuthor = new Book[books.length];
        int j = 0;
        for (Book elem : books) {
            if (elem.getAuthor().equals(author)) {
                booksAuthor[j] = elem;
                j++;
            }
        }
        if (j == 0) {
            System.out.println("Выбранного автора не найдено");
        }
        return Arrays.copyOf(booksAuthor, j);
    }
    public <number_percent> void revaluation(int number_percent) {
        for (Book elem : books) {
            elem.setPrice(elem.getPrice() +(elem.getPrice() * number_percent/ 100));
        }
    }
}
