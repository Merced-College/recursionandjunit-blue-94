import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursionTests {
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
}
