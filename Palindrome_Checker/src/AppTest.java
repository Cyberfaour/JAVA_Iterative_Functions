import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class AppTest {
    
    @Test
    public void testIsPalindromeSimp_Pass(){
        String str="12344321";
        assertTrue(App.isPalindrome(str));
    }
    @Test
    public void testIsPalindromeSimp_fail(){
        String str="3214121";
        assertFalse(App.isPalindrome(str));
    }
    @Test
    public void testIsPalindromeIterate_Pass(){
        String str="2002 aliila 2002";
        assertTrue(App.isPalindromeIterate(str));
    }
    @Test
    public void testIsPalindromeIterate_Fail(){
        String str="2002 aliila2002";
        assertFalse(App.isPalindromeIterate(str));
    }
    @Test
    public void testIsPalindromeAPI_Pass(){
        String str="2002 aliila 2002";
        assertTrue(App.isPlaindromeAPI(str));
    }
    @Test
    public void testIsPalindromeAPI_Fail(){
        String str="2002 aliila2002";
        assertFalse(App.isPlaindromeAPI(str));
    }
}
