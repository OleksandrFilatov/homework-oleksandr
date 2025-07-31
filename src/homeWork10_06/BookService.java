package homeWork10_06;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public boolean addNewBook(Book newBook) {


        if (validateNewBook(newBook)) {
            return bookRepository.save(newBook);
        } else {
            return false;
        }

    }

    private boolean validateNewBook(Book newBook) {
        if (newBook.getBookId().isBlank()) {
            return false;
        }
        if (newBook.getAuthor().isBlank()) {
            return false;
        }
        if (newBook.getTitle().isBlank()) {
            return false;
        }

        if (bookRepository.findByBookId(newBook.getBookId()) != null) {


            return false;
        }

        if (bookRepository.findByBookTitle(newBook.getTitle()) != null) {
            return false;
        }

        return true;
    }


    public Book findBookById(String bookId){


        return bookRepository.findByBookId(bookId);
    }

    public Book findBookByTitle(String title){

        return bookRepository.findByBookTitle(title);
    }

    public Book[] findBooksByAuthor(String author){

        return bookRepository.findByBookAuthor(author);
    }

}
