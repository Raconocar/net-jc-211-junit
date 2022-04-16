package Library.users;

import Library.Interfaces.Administrate;
import Library.Interfaces.Library;
import Library.Interfaces.Read;
import Library.Interfaces.Supply;

public class AdministratorLibrarian extends User implements Administrate, Library {
    public AdministratorLibrarian(String FIO) {
        super(FIO);
    }

    @Override
    public String getFIO() {
        return super.getFIO();
    }

    @Override
    public void giveBook(Read reader, String bookTitle) {
        System.out.println("Библиотекарь " + this.getFIO() + " выдал читателю " + reader.getFIO() + " книгу " + bookTitle);
    }

    @Override
    public void overdueNotification(Read reader) {
        System.out.println("СКОРО НАСТАНЕТ ДЕНЬ РАСПЛАТЫ! " + reader.getFIO() + ", не забудьте вернуть книгу, пожалуйста.");
    }

    @Override
    public void getBookBack(Read reader, String bookTitle) {
        System.out.println("Библиотекарь " + this.getFIO() + " принял от читателя " + reader.getFIO() + " книгу " + bookTitle);

    }

    @Override
    public void makeBookOrder(Supply supplyer, String bookTitle) {
        System.out.println("Библиотекарь " + this.getFIO() + " Сделал заказ поставщику " + supplyer.getFIO() + " на книгу " + bookTitle);

    }
}
