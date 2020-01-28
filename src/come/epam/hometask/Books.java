package come.epam.hometask;

import java.util.Arrays;
public class Books {
    private Book[] books = new Book[]{
            new Book(101, "Java", "Ivanhoe", "Kiev",
                    2010, 700, 250),
            new Book(102, "PHP", "Ivanhoe", "London",
                    2017, 250, 200),
            new Book(103, "C++", "Kovalov", "Lviv",
                    2020, 500, 350)};

    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
         public void printBooks() {
            for (Book elem : books) {
                elem.viewBook();
            }
        }
        
        public Book[] searchBooks(int number_year) {
            Book[] booksUn = new Book[books.length];
            int i = 0;
            for (Book elem : books) {
                if ((elem.getYear_of_publication()>=number_year)) {
                    booksUn[i] = elem;
                    i++;
                }
            }
            return Arrays.copyOf(booksUn, i);
    }
}