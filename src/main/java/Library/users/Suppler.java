package Library.users;


import Library.Interfaces.Library;
import Library.Interfaces.Supply;

import java.util.ArrayList;
import java.util.List;

public class Suppler extends User implements Supply {
    private List SuppliedBooks= new ArrayList<String>();

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
        this.SuppliedBooks.add(bookTitle);
        return strbld.toString();

    }

    public List getSuppliedBooks() {
        return SuppliedBooks;
    }
}