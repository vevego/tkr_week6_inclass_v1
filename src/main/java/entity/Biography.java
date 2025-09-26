package entity;
import jakarta.persistence.*;

@Entity
@Table(name="biography")
public class Biography {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long biographyId;
    @Column
    private String details;

    @OneToOne
    @JoinColumn(name="authorId")
    private Author author;

    public Biography() {}
    public Biography(String details) {
        this.details = details;
    }
    public long getId() {
        return biographyId;
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
