package Nitish.Student_library_management_system.Models;

import org.hibernate.mapping.UniqueKey;

import javax.persistence.*;

@Entity
@Table(name="student_info")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String name;

    @Column(unique = true)
    private String email;

    private String mobNo;

    private int age;

    private String country;

    public CardId getCardId() {
        return cardId;
    }

    public void setCardId(CardId cardId) {
        this.cardId = cardId;
    }

    //Plain syntax for bi direction mapping
    //Name of the Variable of parent entity that you have written in child class foreign attribute.
    @OneToOne(mappedBy = "student",cascade =CascadeType.ALL)
    private CardId cardId;

    public Student() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
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
}
