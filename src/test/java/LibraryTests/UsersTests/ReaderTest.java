package LibraryTests.UsersTests;

import Library.Interfaces.Library;
import Library.users.AdministratorLibrarian;
import Library.users.Reader;
import Library.users.Suppler;
import Library.users.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest  {
    private static long suiteStartTime;
    private long testStartTime;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running StringTest Reader");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("StringTest complete: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete:" + (System.nanoTime() - testStartTime));
    }
    @Test
    void getFIO() {
        //        given
        String TestUserFIO = "Test Test Test";
        // when
        User testuser = new Suppler(TestUserFIO);
        // then
        Assertions.assertEquals(TestUserFIO, testuser.getFIO());
    }

    @Test
    void takeBook() {
        //        given
        String TestLibrarianFIO = "Lib Lib Lib";
        String TestBookTitle = "Test Book ";
        String TestReaderFIO = "Read Read Read";
        String expected = "Спасибо, "+TestLibrarianFIO+". Вот возвращаю книгу "+TestBookTitle+". Заберите, пжалста. прочитал-с.";
        //when
        User testRead = new Reader(TestReaderFIO);
        User testLib = new AdministratorLibrarian(TestLibrarianFIO);
        //then
        Assertions.assertEquals(expected, ((Reader) testRead).returnBook((Library) testLib,TestBookTitle));


    }

    @Test
    void returnBook() {
        //        given
        String TestLibrarianFIO = "Lib Lib Lib";
        String TestBookTitle = "Test Book ";
        String TestSupplierFIO = "Sup Sup Sup";
        String expected = "Поставщик " + TestSupplierFIO + " прислал книгу:" + TestBookTitle + " библиотекарю " + TestLibrarianFIO;
        //when
        User testSup = new Suppler(TestSupplierFIO);
        User testLib = new AdministratorLibrarian(TestLibrarianFIO);
        //then
        Assertions.assertEquals(expected, ((Suppler) testSup).supplyBook((Library) testLib,TestBookTitle));

    }
}