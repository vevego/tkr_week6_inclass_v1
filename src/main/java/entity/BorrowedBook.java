package entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class BorrowedBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    Date borrowDate;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Book book;

    public BorrowedBook() {}

    public BorrowedBook(Date borrowDate, Student student, Book book) {
        this.borrowDate = borrowDate;
        this.student = student;
        this.book = book;
    }

    public long getId() {
        return id;
    }
    public Date getBorrowDate() {
        return borrowDate;
    }
    public Student getStudent() {
        return student;
    }
    public Book getBook() {
        return book;
    }
    public void setDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setBook(Book book) {
        this.book = book;
    }
}
