package entity;

import jakarta.persistence.*;

@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorId;
    @Column
    private String name;
    @OneToOne(mappedBy = "author")
    private Biography biography;

    public Author() {}
    public Author(String name) {
        this.name = name;
    }

    public long getId() {
        return authorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Biography getBiography() {
        return biography;
    }
    public void setBiography(Biography biography) {
        this.biography = biography;
    }
}
