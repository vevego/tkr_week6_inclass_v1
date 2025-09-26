package entity;

import jakarta.persistence.*;

@Entity
@Table(name="book")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;
    @Column
    private String title;

    public Book() {}

    public Book(String title) {
        this.title = title;
    }

    public long getId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
