import static org.junit.Assert.*;
import org.junit.Test;

public class test{
    @Test
    public void testReverseStringSimp(){
        String str="Hello";
        String expected="olleH";
        String actual=App.ReverseStringSimp(str);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverse(){
        String str="ali ibrahim faour";
        String expected="ruoaf miharbi ila";
        String actual=App.reverse(str);
        assertEquals(expected, actual);
    }
    @Test
    public void testReverseUsingStack(){
        String str="ali";
        String expected="ila";
        String actual=App.reverse(str);
        assertEquals(expected, actual);
    }
    @Test
    public void testReverseWords(){
        String str="ali Ibrahim Faour";
        String expected="ila miharbI ruoaF ";
        String actual=App.reverseWords(str);
        assertEquals(expected, actual);
    }
    @Test
    public void testReverseFunctional(){
        String str="ALI IBRAHIM FAOUR";
        String expected="ILA MIHARBI RUOAF";
        String actual=App.reverseFunctional(str);
        assertEquals(expected, actual);
    }


}