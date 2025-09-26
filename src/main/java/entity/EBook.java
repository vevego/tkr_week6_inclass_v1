package entity;

import jakarta.persistence.*;
@Entity
@Table(name="ebook")
public class EBook extends Book {
    @Column
    private String downloadLink;

    public EBook() {}

    public EBook(String title, String downloadlink) {
        super(title);
        this.downloadLink = downloadlink;
    }

    public String getDownloadLink() {
        return downloadLink;
    }
    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}

