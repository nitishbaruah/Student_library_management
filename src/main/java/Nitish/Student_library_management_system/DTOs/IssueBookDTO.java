package Nitish.Student_library_management_system.DTOs;

public class IssueBookDTO {
    private int CardId;
    private int BookId;

    public IssueBookDTO() {
    }

    public int getCardId() {
        return CardId;
    }

    public void setCardId(int cardId) {
        CardId = cardId;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }
}
