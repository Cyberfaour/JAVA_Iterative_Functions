import org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    @Test   
    public void testPermuteAndPrint() {
        String str = "abc";
        String expectedResult = "abc acb bac bca cab cba";

        App.permuteAndPrint(str);

        assertEquals(expectedResult, outContent .toString());
    }
}
