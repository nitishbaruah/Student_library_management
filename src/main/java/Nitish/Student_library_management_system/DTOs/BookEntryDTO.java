package Nitish.Student_library_management_system.DTOs;

import Nitish.Student_library_management_system.Enums.Genre;

public class BookEntryDTO {
    private int pages;
    private String name;
    private int authorId;
    private Genre genre;

    public BookEntryDTO() {
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
