package Library.users;


import Library.Interfaces.Library;
import Library.Interfaces.Supply;

public class Suppler extends User implements Supply {

    public Suppler(String FIO) {
        super(FIO);
    }

    @Override
    public String getFIO() {
        return super.getFIO();
    }

    @Override
    public String supplyBook(Library librarian, String bookTitle) {
        StringBuilder strbld = new StringBuilder();
        strbld.append("Поставщик " + this.getFIO() + " прислал книгу:" + bookTitle + " библиотекарю " + librarian.getFIO());
        return strbld.toString();

    }
}