

public class Book {
    public String bookID;
    private String title;
    private String author;
    private String domain;
    private String description;

    public Book(String bookID, String title, String author, String domain) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.domain = domain;
    }
    
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookId) {
        this.bookID = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
    public String toString() {
        return title + " by " + author;
    }
    
}
