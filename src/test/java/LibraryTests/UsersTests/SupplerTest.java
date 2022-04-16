package LibraryTests.UsersTests;

import Library.Interfaces.Library;
import Library.users.AdministratorLibrarian;
import Library.users.Suppler;
import Library.users.User;
import org.junit.jupiter.api.*;


class SupplerTest {
    private static long suiteStartTime;
    private long testStartTime;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running StringTest Supplier");
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
    void supplyBook() {
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