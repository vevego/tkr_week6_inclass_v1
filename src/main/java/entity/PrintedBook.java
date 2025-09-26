package entity;

import jakarta.persistence.*;

@Entity
public class PrintedBook extends Book {
    @Column
    private int pageCount;

    public PrintedBook() {}
    public PrintedBook(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
