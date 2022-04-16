package Library.Interfaces;

public interface Administrate extends User{

    public void giveBook(Read reader, String book);

    public void overdueNotification(Read reader);

}