import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursionTests {
    // count8 tests(5):
    @Test
    public void count8Test1() {
        assertEquals(Main.count8(8), 1);
    }    

    @Test
    public void count8Test2() {
        assertEquals(Main.count8(818), 2);
    }

    @Test
    public void count8Test3() {
        assertEquals(Main.count8(8818), 4);
    }

    @Test
    public void count8Test4() {
        assertEquals(Main.count8(88188), 6);
    }

    @Test
    public void count8Test5() {
        assertEquals(Main.count8(88), 3);
    }

    // countHi tests (5):
    @Test
    public void countHiTest1() {
        assertEquals(Main.countHi("xxhixx"), 1);
    }

    @Test
    public void countHiTest2() {
        assertEquals(Main.countHi("xhixhix"), 2);
    }

    @Test
    public void countHiTest3() {
        assertEquals(Main.countHi("hi"), 1);
    }

    @Test
    public void countHiTest4() {
        assertEquals(Main.countHi("hihihihihi"), 5);
    }

    @Test
    public void countHiTest5() {
        assertEquals(Main.countHi("xxxxxxxxxxHI"), 0);
    }

    // countHi2 tests (5):
    @Test
    public void countHi2Test1() {
        assertEquals(Main.countHi2("ahixhi"), 1);
    }

    @Test
    public void countHi2Test2() {
        assertEquals(Main.countHi2("ahibhi"), 2);
    }

    @Test
    public void countHi2Test3() {
        assertEquals(Main.countHi2("xhixhi"), 0);
    }

    @Test
    public void countHi2Test4() {
        assertEquals(Main.countHi2("hix"), 1);
    }

    @Test
    public void countHi2Test5() {
        assertEquals(Main.countHi2("xhihi"), 1);
    }

    // strCount tests (5):

    @Test
    public void strCountTest1() {
        assertEquals(Main.strCount("catcowcat", "cat"), 2);
    }

    @Test
    public void strCountTest2() {
        assertEquals(Main.strCount("catcowcat", "cow"), 1);
    }

    @Test
    public void strCountTest3() {
        assertEquals(Main.strCount("catcowcat", "dog"), 0);
    }

    @Test
    public void strCountTest4() {
        assertEquals(Main.strCount("sunnydayrealestate", "state"), 1);
    }

    @Test
    public void strCountTest5() {
        assertEquals(Main.strCount("novemberaprilapril", "april"), 2);
    }

    // stringClean tests (5):
    @Test
    public void stringCleanTest1() {
        assertEquals(Main.stringClean("yyzza"), "yza");
    }

    @Test
    public void stringCleanTest2() {
        assertEquals(Main.stringClean("abbbcdd"), "abcd");
    }

    @Test
    public void stringCleanTest3() {
        assertEquals(Main.stringClean("Hello"), "Helo");
    }

    @Test
    public void stringCleanTest4() {
        assertEquals(Main.stringClean("aaaaaaaaaaaaaaaaa"), "a");
    }

    @Test
    public void stringCleanTest5() {
        assertEquals(Main.stringClean("zzyyopzz"), "zyopz");
    }
}
