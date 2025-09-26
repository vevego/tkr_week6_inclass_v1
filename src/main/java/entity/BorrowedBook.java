package entity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="borrowedbook")
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long borrowedBookId;

    @Column
    LocalDate borrowDate;

    @ManyToOne
    @JoinColumn(name="studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name="bookId")
    private Book book;

    public BorrowedBook() {}

    public BorrowedBook(LocalDate borrowDate, Student student, Book book) {
        this.borrowDate = borrowDate;
        this.student = student;
        this.book = book;
    }

    public long getId() {
        return borrowedBookId;
    }
    public LocalDate getBorrowDate() {
        return borrowDate;
    }
    public Student getStudent() {
        return student;
    }
    public Book getBook() {
        return book;
    }
    public void setDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setBook(Book book) {
        this.book = book;
    }
}
