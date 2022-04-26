package LibraryTests.UsersTests;

import Library.Interfaces.Library;
import Library.users.AdministratorLibrarian;
import Library.users.Suppler;
import Library.users.User;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;


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
        Assertions.assertEquals(expected, ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle));
    }

    @Test
    void getSuppliedBooksTest1() {
        //given

        String TestLibrarianFIO = "Lib Lib Lib";
        String TestBookTitle1 = "Test Book 1 ";
        String TestBookTitle2 = "Test Book 2 ";
        String TestBookTitle3 = "Test Book 3 ";
        String TestBookTitle4 = "Test Book 4 ";
        String TestSupplierFIO = "Sup Sup Sup";
        //when
        User testSup = new Suppler(TestSupplierFIO);
        User testLib = new AdministratorLibrarian(TestLibrarianFIO);
        //then
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle1);
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle2);
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle3);
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle4);
        List<String> testlist = ((Suppler) testSup).getSuppliedBooks();
        assertThat(testlist, hasSize(3));


    }

    @Test
    void getSuppliedBooksTest2() {
        //given

        String TestLibrarianFIO = "Lib Lib Lib";
        String TestBookTitle1 = "Test Book 1 ";
        String TestBookTitle2 = "Test Book 2 ";
        String TestBookTitle3 = "Test Book 3 ";
        String TestBookTitle4 = "Test Book 4 ";
        String TestSupplierFIO = "Sup Sup Sup";
        //when
        User testSup = new Suppler(TestSupplierFIO);
        User testLib = new AdministratorLibrarian(TestLibrarianFIO);
        //then
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle1);
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle2);
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle3);
        ((Suppler) testSup).supplyBook((Library) testLib, TestBookTitle4);
        List<String> testlist = ((Suppler) testSup).getSuppliedBooks();

        assertThat(testlist, hasItem("Test Book 4 "));


    }
}