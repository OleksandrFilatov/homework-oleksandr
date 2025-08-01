package main.Task1;

public class App {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();
        BookService service = new BookService(repository);
        UserMenu menu = new UserMenu(service);
        menu.start();
    }
}
