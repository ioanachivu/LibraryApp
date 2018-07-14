
import java.util.Date;

public class BookBorrowing {
    public Book borrowdBook;
    public Reader readerThatBorrowed;
    public Date dateOfBorrow;

    public BookBorrowing(Book borrowedBook, Reader cititorImprumuta, Date dataImprumut) {
        this.borrowdBook = borrowedBook;
        this.readerThatBorrowed = cititorImprumuta;
        this.dateOfBorrow = dataImprumut;
    }

    public Book getBorrowdBook() {
        return borrowdBook;
    }

    public void setBorrowdBook(Book book) {
        this.borrowdBook = book;
    }

    public Reader getReaderThatBorrowed() {
        return readerThatBorrowed;
    }

    public void setReaderThatBorrowed(Reader reader) {
        this.readerThatBorrowed = reader;
    }

    public Date getDateOfBorrow() {
        return dateOfBorrow;
    }

    public void setDateOfBorrow(Date date) {
        this.dateOfBorrow = date;
    }
    
    @Override
    public String toString() {
        return borrowdBook + " borrowed by " + readerThatBorrowed + " in date " + dateOfBorrow;
    }
    
}
