
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Library {
    
    Set<Reader> readersList = new HashSet<>();
    Set<Book> booksList = new HashSet<>();
    Set<BookBorrowing> borrowBookList = new HashSet<>();
   
    // 
    // BOOK -----------------------------------------------------------------------
    // adding a book 
    public void addingBook (Book book) {
        booksList.add(book);
    }
    
    // updating a book
    public void updatingBook(String bookName, String bookAuthor ){
        Scanner input = new Scanner(System.in);
        for(Book c: booksList) {
            if (c.getTitle().equals(bookName) && c.getAuthor().equals(bookAuthor)) {
                System.out.println("What do you want to change: domain/description");
                if (input.nextLine().equals("domain")) {
                    System.out.println("Insert the new domain:");
                    c.setDomain(input.nextLine());
                } else {
                    System.out.println("Insert a description");
                    c.setDescription(input.nextLine());
                }
            } input.close();
        }
    }
    
    // deleting a book by name and author
    public void deletingBook() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Insert the name of the book you want to delete:");
    	String bookName = input.nextLine();
    	System.out.println("Insert the author of the book you want to delete:");
    	String bookAuthor = input.nextLine();
        for (Book c: booksList) {
            if (c.getTitle().equals(bookName) && c.getAuthor().equals(bookAuthor)) {
                booksList.remove(c);
                System.out.println("Book: "+c.getTitle()+" by "+c.getAuthor()+" was deleted");
                break;
            } 
        }  input.close();
    }
    
    // deleting a book using the book object
    public void deletingBook(Book c) {
        booksList.remove(c); 
        System.out.println("Book: "+c.getTitle()+" by "+c.getAuthor()+" was deleted");
    }
    
    // listing all the books
    public void listingBook(){
        for(Book c: booksList) 
            System.out.println(c.getTitle()+": "+c.getAuthor()+" is in the library");
    }
    
    // listing all the authors
    public void listingAuthors() {
        for(Book c: booksList) {
            System.out.println("Author: "+c.getAuthor()+" is in the library");
        }
    }
    
    // READER -----------------------------------------------------------------
    // adding a reader
    public void addReader (Reader reader) {
        readersList.add(reader);
    }
    
    // updating a reader
    public void updateReader(String ssn){
        Scanner input = new Scanner(System.in);
        for(Reader c: readersList) {
            if (c.getSsn().equals(ssn)) {
                System.out.println("Insert new name:");
                    c.setName(input.nextLine());
                } 
            } input.close();
        }
    
    // deleting a reder
    public void deleteReader(String readerToBeDeleted) {
        for (Reader c: readersList) {
            if (c.getSsn().equals(readerToBeDeleted)) {
                readersList.remove(c);
                System.out.println("Reader: "+c.getName()+" was deleted");
            break;
            } 
        } 
    }
    
    // deleting a reader using the reader object
    public void deleteReader(Reader c) {
        readersList.remove(c);
        System.out.println("Reader: "+c.getName()+" has been deleted");
    }
    
    // listing all the readers
    public void listingReaders () {
        for(Reader c: readersList) {
            System.out.println("Reader "+c.getName()+" is in the data base");
        }
    }
    
    // SEARCHING -----------------------------------------------------------------
    // searching for a book using the title/author
    public Book searchBook (String searchTerm) {         
        Book bookFound = null;   
        for(Book c : booksList) {
            if (c.getTitle().equals(searchTerm) || c.getAuthor().equals(searchTerm)) {
                bookFound = c;
                break; 
            }
        }   
        return bookFound;
    }
    
    // searching for a reader using the ssn/name
    public Reader searchingReader (String persSearched) {
        Reader persFound = null;
        for (Reader c: readersList) {
            if (c.getSsn().equals(persSearched) || c.getName().equals(persSearched)) {
                persFound = c;
                break;
            }
        }
        return persFound;
    }
    
    // borrowing a book
    public void borrowBook(BookBorrowing b) {
        borrowBookList.add(b);
        System.out.println(b.readerThatBorrowed.toString()+" a imprumutat "+b.borrowdBook.toString());
    }
    
    // returning a book
    public void returnBook (BookBorrowing borrowed) {
    	borrowBookList.remove(borrowed);
        System.out.println(borrowed.readerThatBorrowed.toString()+ " returned "+borrowed.borrowdBook.toString());
    }
    
    public void unreturnedList () { 
        System.out.println("Unreturned books list:");
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime trecut = now.plusDays(-30);
        for(BookBorrowing c: borrowBookList) {
            if(c.dateOfBorrow.toInstant().isBefore(trecut.toInstant()))
                System.out.println(c.toString());
        }
    }
}
