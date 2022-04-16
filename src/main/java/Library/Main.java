package Library;

import Library.Interfaces.printer;
import Library.users.AdministratorLibrarian;
import Library.users.Reader;
import Library.users.Suppler;

public class Main implements printer {

    public static void main(String[] args) {
	// write your code here
        AdministratorLibrarian Vasya = new AdministratorLibrarian("Василий Придёркин");
        Reader Sveta = new Reader("Светик Семицветик");
        Suppler Anton = new Suppler("Антон Городецкий");

        Vasya.makeBookOrder(Anton, "Lord of the Rings");

        printer.printStr(Anton.supplyBook(Vasya, "Lord of the Rings"));
        Vasya.giveBook(Sveta, "Lord of the Rings");
        Sveta.takeBook(Vasya, "Lord of the Rings");
        Vasya.overdueNotification(Sveta);
        printer.printStr(Sveta.returnBook(Vasya, "Lord of the Rings"));
        Vasya.getBookBack(Sveta, "Lord of the Rings");

   }
}
