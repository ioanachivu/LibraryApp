
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();
        
        // BOOK --------------------------------------------------------- 
        // creating book objects
        Book book1 = new Book("1","Morometii","Preda","Roman");
        Book book2 = new Book("2","Luceafarul","Eminescu","Poezii");
        Book book3 = new Book("3","Maitreyi","Mircea Eliade","Roman");
        Book book4 = new Book("4","Teatru","Caragiale","Comedie");
        Book book5 = new Book("5","Baltagul","Sadoveanu","Roman");
       
  
        // adding book objects in set
        library.addingBook(book1);
        library.addingBook(book2);
        library.addingBook(book3);
        library.addingBook(book4);
        library.addingBook(book5);
        
        // updating a book
        library.updatingBook("Teatru", "Caragiale");
        System.out.println(book4.getDomain()+": "+book4.getDescription());
        
        // deleting a book
        library.deletingBook();
        library.deletingBook(book1);
        
        // listing books 
        library.listingBook();
        
        // listing authors
        library.listingAuthors();
        
        // CITITOR-----------------------------------------------------
        // creating reader objects
        Reader reader1 = new Reader("Mihai Lungu","1870625452268");
        Reader reader2 = new Reader("Ana Zaharia","2840621450087");
        Reader reader3 = new Reader("Feli Matei","2850328442077");
        Reader reader4 = new Reader("Miruna Tanase","2858442458023");
        Reader reader5 = new Reader("Dragos Ionescu","1900158447892");
        
        // adding reader objects in list
        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);
        library.addReader(reader4);
        library.addReader(reader5);
        
        // updateing a reader
        library.updateReader("2840621450087");
        System.out.println(reader2.getName());
        
        // deleting a reader
        library.deleteReader("1870625452268");
        //biblioteca.deleteReader(reader1);
        
        // listing all the readers
        library.listingReaders();
        
        
        // SEARCHING---------------------------------------------------------------------
        // searching for a book
        Book bookFound = library.searchBook("Maitreyi");
        if (bookFound instanceof Book) {
            System.out.println("Searched book: "+bookFound.getTitle()+" has been found");
        } else {
            System.out.println("The book was not found");
        }
        
        // searching for a reader
        Reader readerFound = library.searchingReader("Feli Matei");
        if (readerFound instanceof Reader) {
            System.out.println("Reader: "+readerFound.getName()+" has been found");
        } else {
            System.out.println("The reader in not in the data base");
        }
        
        // BORROWING ------------------------------------------------------------
        
        BookBorrowing borrow1 = new BookBorrowing(book2, reader2, new Date());
        BookBorrowing borrow2 = new BookBorrowing(book3, reader3, new Date());
        BookBorrowing borrow3 = new BookBorrowing(book4, reader4, new Date());
        BookBorrowing borrow4 = new BookBorrowing(book5, reader5, new Date());
        
        library.borrowBook(borrow1);
        library.borrowBook(borrow2);
        library.borrowBook(borrow3);
        library.borrowBook(borrow4);
        
        
        // unreturned books
        library.unreturnedList();
    }
}
