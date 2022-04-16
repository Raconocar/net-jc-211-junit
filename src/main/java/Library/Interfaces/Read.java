package Library.Interfaces;

public interface Read extends User {

    void takeBook(Administrate admin, String Book);

    String returnBook(Library librarian, String Book);


}