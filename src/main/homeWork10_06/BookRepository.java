package main.homeWork10_06;

public class BookRepository {

    private Book[] library;
    private int currentQuantity = 0;

    public BookRepository(int librarySize) {
        this.library = new Book[librarySize];
    }

    public boolean save(Book book) {
        if (currentQuantity < library.length) {
            library[currentQuantity] = book;
            currentQuantity++;
            return true;
        } else {
            return false;
        }
    }


    public Book findByBookId(String bookIdSearch) {

        for (int i = 0; i < currentQuantity; i++) {


            if (library[i].getBookId().equals(bookIdSearch)) {
                return library[i];
            }
        }

        return null;
    }


    public Book findByBookTitle(String bookTitleSearch) {

        for (int i = 0; i < currentQuantity; i++) {


            if (library[i].getTitle().equals(bookTitleSearch)) {
                return library[i];
            }
        }

        return null;
    }


    public Book[] findByBookAuthor(String bookAuthorSearch) {


        int counterMatches = 0;

        for (int i = 0; i < currentQuantity; i++) {
            if (library[i].getAuthor().equals(bookAuthorSearch)) {
                counterMatches++;
            }
        }

        Book[] booksByAuthor = new Book[counterMatches];
        int booksByAuthorIndex = 0;


        for (int i = 0; i < currentQuantity; i++) {
            if (library[i].getAuthor().equals(bookAuthorSearch)) {
                booksByAuthor[booksByAuthorIndex] = library[i];
                booksByAuthorIndex++;
            }
        }

        return booksByAuthor;
    }


}
