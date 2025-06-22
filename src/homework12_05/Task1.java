package homework12_05;

public class Task1 {
    public static void main(String[] args) {
        Book tools = new Book();
        tools.setTitle("info");
        tools.setAuthor("Michael");
        tools.setIsIssued(true);
        tools.setYear(1941);
        tools.printInfo();

        Book vocabulary = new Book();
        vocabulary.setTitle("gachi");
        vocabulary.setAuthor("Billy");
        vocabulary.setIsIssued(false);
        vocabulary.setYear(2011);
        vocabulary.printInfo();
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private boolean isIssued;

    void printInfo() {
        System.out.println("\nBook title: " + getTitle() + "\nAuthor: " + getAuthor() + "\nYear: " + getYear() + "\nIs Issued or not? " + getIsIssued());
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    boolean getIsIssued() {
        return isIssued;
    }

    void setIsIssued(boolean isIssued) {
        this.isIssued = isIssued;
    }

}
