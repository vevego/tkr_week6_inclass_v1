package entity;
import jakarta.persistence.*;

@Entity
public class Biography {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String details;

    @OneToOne(mappedBy = "biography")
    private Author author;

    public Biography() {}
    public Biography(String details) {
        this.details = details;
    }
    public long getId() {
        return id;
    }
    public String getDetails() {
        return details;
    }
    public Author getAuthor() {
        return author;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

}
