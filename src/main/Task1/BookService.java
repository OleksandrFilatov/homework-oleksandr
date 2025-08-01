package main.Task1;

public class BookService {
    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public void addBook(int id, String title, String author) {
        Book book = new Book(id, title, author);
        repository.save(book);
    }

    public Book searchById(int id) {
        return repository.findById(id);
    }

    public Book searchByTitle(String title) {
        return repository.findByTitle(title);
    }
}
