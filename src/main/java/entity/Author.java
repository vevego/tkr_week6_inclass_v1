package entity;

import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @OneToOne()
    @JoinColumn(name="id")
    private Biography biography;

    public Author() {}
    public Author(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
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
