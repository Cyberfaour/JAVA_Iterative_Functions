import org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class AppTest {
    @Test
    public void testCountOccurences_Pass(){
        String str="landlnadn awnlkanclnad";
        String ch="a";
        int expected=5;
        assertEquals(expected, App.countOccurences(str, ch));
    }
    @Test
    public void testCountOccurences_Fail(){
        String str="landlnadn awnlkanclnad";
        String ch="a";
        int expected=2;
        assertEquals(expected, App.countOccurences(str, ch));
    }
    @Test
    public void testCountOccurencesFast_Pass(){
        String str="landlnadn awnlkanclnad";
        char ch=' ';
        int expected=2;
        assertEquals(expected,App.countOccurences_Fast(str, ch));
    }
    @Test
    public void testCountOccurencesFast_Fail(){
        String str="landlnadn awnlkanclnad";
        char ch='z';
        int expected=2;
        assertEquals(expected,App.countOccurences_Fast(str, ch));
    }
}
