package dao;

import entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LibraryDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("tkrPU");
    private EntityManager em = emf.createEntityManager();

    public void createAuthor(Author author){
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();
    }
    public Author getAuthor(long id){
        return em.find(Author.class, id);
    }
    public void updateAuthor(Author author){
        em.getTransaction().begin();
        em.merge(author);
        em.getTransaction().commit();
    }
    public void deleteAuthor(long id){
        em.getTransaction().begin();
        Author author = em.find(Author.class, id);
        if (author != null){
            em.remove(author);
        }
        em.getTransaction().commit();
    }

    public void createBiography(Biography biography){
        em.getTransaction().begin();
        em.persist(biography);
        em.getTransaction().commit();
    }
    public Biography getBiography(long id){
        return em.find(Biography.class, id);
    }
    public void updateBiography(Biography biography){
        em.getTransaction().begin();
        em.merge(biography);
        em.getTransaction().commit();
    }
    public void deleteBiography(long id){
        em.getTransaction().begin();
        Biography biography = em.find(Biography.class, id);
        if (biography != null){
            em.remove(biography);
        }
        em.getTransaction().commit();
    }

    public void createStudent(Student student){
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }
    public Student getStudent(long id){
        return em.find(Student.class, id);
    }
    public void updateStudent(Student student){
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }
    public void deleteStudent(long id){
        em.getTransaction().begin();
        Student student = em.find(Student.class, id);
        if (student != null){
            em.remove(student);
        }
        em.getTransaction().commit();
    }

    public void Book(Book book){
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
    }
    public Book getBook(long id){
        return em.find(Book.class, id);
    }
    public void updateBook(Book book){
        em.getTransaction().begin();
        em.merge(book);
        em.getTransaction().commit();
    }
    public void deleteBook(long id){
        em.getTransaction().begin();
        Book book = em.find(Book.class, id);
        if (book != null){
            em.remove(book);
        }
        em.getTransaction().commit();
    }

    public void createBorrowedBook(BorrowedBook borrowedBook){
        em.getTransaction().begin();
        em.persist(borrowedBook);
        em.getTransaction().commit();
    }
    public BorrowedBook getBorrowedBook(long id){
        return em.find(BorrowedBook.class, id);
    }
    public void updateBorrowedBook(BorrowedBook borrowedBook){
        em.getTransaction().begin();
        em.merge(borrowedBook);
        em.getTransaction().commit();
    }
    public void deleteBorrowedBook(long id){
        em.getTransaction().begin();
        BorrowedBook book = em.find(BorrowedBook.class, id);
        if (book != null){
            em.remove(book);
        }
        em.getTransaction().commit();
    }
}
