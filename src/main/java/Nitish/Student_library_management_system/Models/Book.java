package Nitish.Student_library_management_system.Models;

import Nitish.Student_library_management_system.Enums.Genre;

import javax.persistence.*;

@Entity
@Table(name="Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;

    @Enumerated(value=EnumType.STRING)
    private Genre genre;

    private int pages;

    @ManyToOne
    @JoinColumn //Add an extra attribute of AuthorId(Parent table) for the foreign key at the child table
    private Author author;

    @ManyToOne
    @JoinColumn
    private CardId cardId;

    public Book() {

    }

    //Setter and Getter
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
