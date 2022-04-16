package Library.users;

import Library.Interfaces.Administrate;
import Library.Interfaces.Library;
import Library.Interfaces.Read;


public class Reader extends User implements Read{

    public Reader(String FIO) {
        super(FIO);
    }

    @Override
    public String getFIO() {
        return super.getFIO();
    }

    @Override
    public void takeBook(Administrate admin, String bookTitle) {
        System.out.println("Читатель " + this.FIO + " взял книгу: " + bookTitle);

    }

    @Override
    public String returnBook(Library librarian, String bookTitle) {
        StringBuilder strbld = new StringBuilder();
        strbld.append("Спасибо, "+librarian.getFIO()+". Вот возвращаю книгу "+bookTitle+". Заберите, пжалста. прочитал-с.");
        return strbld.toString();
    }
}