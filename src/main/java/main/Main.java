package main;
import entity.*;
import dao.*;

public class Main {
    public static void main(String[] args) {
        LibraryDAO dao = new LibraryDAO();

        // Add and persist a Student
        Student student = new Student("Veera");
        dao.createStudent(student);
        // Update the Student's name
        student.setName("Veera R");
        dao.updateStudent(student);
        // Retrieve and print the Student's details
        Student retrievedStudent = dao.getStudent(student.getId());
        System.out.println("Student ID: " + retrievedStudent.getId() + ", Name: " + retrievedStudent.getName());

        // Add Ebook
        Book ebook = new EBook("Java Programming", "http://downloadlink.com/java");
        dao.createBook(ebook);
        // Update Ebook title
        ebook.setTitle("Advanced Java Programming");
        dao.updateBook(ebook);
        // Retrieve and print Ebook details
        Book retrievedEbook = dao.getBook(ebook.getId());
        System.out.println("EBook ID: " + retrievedEbook.getId() + ", Title: " + retrievedEbook.getTitle() +", Download Link: " + ((EBook)retrievedEbook).getDownloadLink());

        // Create printed book
        Book printedBook = new PrintedBook("Database Systems", 500);
        dao.createBook(printedBook);
        // Update number of pages
        ((PrintedBook) printedBook).setPageCount(550);
        dao.updateBook(printedBook);
        // Retrieve and print printed book details
        Book retrievedPrintedBook = dao.getBook(printedBook.getId());
        System.out.println("Printed Book ID: " + retrievedPrintedBook.getId() + ", Title: " + retrievedPrintedBook.getTitle() + ", Pages: " + ((PrintedBook)retrievedPrintedBook).getPageCount());

        // Create borrowed book
        BorrowedBook borrowedBook = new BorrowedBook(java.time.LocalDate.now(), retrievedStudent, retrievedEbook);
        dao.createBorrowedBook(borrowedBook);
        // Update borrow date
        borrowedBook.setDate(java.time.LocalDate.now().plusDays(1));
        dao.updateBorrowedBook(borrowedBook);
        // Retrieve and print borrowed book details
        BorrowedBook retrievedBorrowedBook = dao.getBorrowedBook(borrowedBook.getId());
        System.out.println("Borrowed Book ID: " + retrievedBorrowedBook.getId() + ", Borrow Date: " + retrievedBorrowedBook.getBorrowDate() + ", Student: " + retrievedBorrowedBook.getStudent().getName() + ", Book: " + retrievedBorrowedBook.getBook().getTitle());

        // Create author
        Author author = new Author("John Doe");
        dao.createAuthor(author);
        // Update author's name
        author.setName("John D.");
        dao.updateAuthor(author);
        // Retrieve and print author's details
        Author retrievedAuthor = dao.getAuthor(author.getId());
        System.out.println("Author ID: " + retrievedAuthor.getId() + ", Name: " + retrievedAuthor.getName());

        // Create biography
        Biography biography = new Biography("John D., the story of my life...");
        dao.createBiography(biography);
        biography.setAuthor(retrievedAuthor);
        retrievedAuthor.setBiography(biography);
        dao.updateAuthor(retrievedAuthor);
        // Update biography details
        biography.setDetails("John D., an updated story of my life...");
        dao.updateBiography(biography);
        // Retrieve and print biography details
        Biography retrievedBiography = dao.getBiography(biography.getId());
        System.out.println("Biography ID: " + retrievedBiography.getId() + ", Details: " + retrievedBiography.getDetails() + ", Author: " + retrievedBiography.getAuthor().getName());

        dao.close();
    }
}
