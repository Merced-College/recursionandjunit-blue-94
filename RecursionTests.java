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
}
