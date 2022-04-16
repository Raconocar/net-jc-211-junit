package Library.Interfaces;

public interface Library extends User {
    void getBookBack(Read reader, String bookTitle);

    void makeBookOrder(Supply supplyer, String bookTitle);
}