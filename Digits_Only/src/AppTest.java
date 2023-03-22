import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest{
    @Test
    public void testContainsOnlyDigits_withDigits_returnsTrue(){
        String str="123456";
        boolean result=App.containsOnlyDigits(str);
        assertTrue(result);
    }
    @Test 
    public void testContainsOnlyDigits_invalidInput(){
        String str ="ali adklalasdlasd";
        assertFalse( App.containsOnlyDigits(str));
    }
    @Test
    public void testContainsOnlyDigits_emptyString(){
        String str="";
        assertTrue(App.containsOnlyDigits(str));
    }
    @Test
    public void testContainsOnlyDigits_nullInput(){
        String str=null;
        assertFalse(App.containsOnlyDigits(str));
    }
    @Test
    public void testContainsOnlyDigitsFunctional(){
        String str="123456";
        assertTrue(App.containsOnlyDigitsFuncional(str));
    }
    @Test
    public void testContainsOnlyDigitsFunctional_Invalid(){
        String str="ali ibrahim ";
        assertFalse(App.containsOnlyDigitsFuncional(str));
    }
    @Test
    public void testContainsOnlyDigitsFunctional_Empty(){
        String str="";
        assertTrue(App.containsOnlyDigitsFuncional(str));

    }
    @Test
    public void testContainsOnlyDigitsFunctional_Null(){
        String str=null;
        assertFalse(App.containsOnlyDigitsFuncional(str));
    }
    @Test 
    public void testContainsOnlyDigitsRegex(){
        String str="1234556";
        assertTrue(App.containsOnlyDigitsRegex(str));

    }
    @Test 
    public void testContainsOnlyDigitsRegex_Invalid(){
        String str="fknandncnald";
        assertFalse(App.containsOnlyDigitsRegex(str));

    }
    @Test
    public void testContainsOnlyDigitsRegex_Empty(){
        String str="";
        assertFalse(App.containsOnlyDigitsRegex(str));

    }
    @Test
    public void testContainsOnlyDigitsRegex_Null(){
        String str=null;
        assertFalse(App.containsOnlyDigitsRegex(str));

    }

}