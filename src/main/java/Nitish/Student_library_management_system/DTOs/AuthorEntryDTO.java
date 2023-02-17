package Nitish.Student_library_management_system.DTOs;

public class AuthorEntryDTO {
    private String name;
    private int age;
    private String country;
    private double authorRating;

    public AuthorEntryDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAuthorRating() {
        return authorRating;
    }

    public void setAuthorRating(double authorRating) {
        this.authorRating = authorRating;
    }
}
