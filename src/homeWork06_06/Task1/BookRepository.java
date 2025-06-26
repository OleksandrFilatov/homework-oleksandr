package homeWork06_06.Task1;

public class BookRepository {
    private Book[] books = new Book[100];
    private int size = 0;

    public void save(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("Хранилище переполнено!");
        }
    }

    public Book findById(int id) {
        for (int i = 0; i < size; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        return null;
    }

    public Book findByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }
}
