package Nitish.Student_library_management_system.Models;

import Nitish.Student_library_management_system.Enums.CardStatus;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="card")
public class CardId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @CreationTimestamp // Auto created timestamp during creation;
    private Date createdOn;

    @UpdateTimestamp //Set timestamp when card is updated;
    private Date UpdatedOn;

    @Enumerated(value=EnumType.STRING)
    private CardStatus cardStatus;

    @OneToOne
    @JoinColumn
    private Student student; // this variable used in parent while doing bidirectional mapping

    @OneToMany(mappedBy = "cardId",cascade = CascadeType.ALL)
    private List<Book> bookIssued;

    public CardId() {
       this.bookIssued= new ArrayList<>();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return UpdatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        UpdatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
