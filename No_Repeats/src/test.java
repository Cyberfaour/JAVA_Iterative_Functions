import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class test {

    @Test
    public void testFirstNonRepeatedCharacter() {
        assertEquals('l', App.FirstNonRepeatedCharacter("awdasdawasawdasaddsdawdasdawl"));
    }

    @Test
    public void testFirstNonRepeatedCharacterMap() {
        assertEquals('l', App.FirstNonRepeatedCharacterMap("awdasdawasawdasaddsdawdasdawl"));
    }
    @Test
    public void testFirstNonRepeatedCharacterFunctional() {
        String str1 = "abcdefghija";
        String expectedResult1 = "b";
       // assertEquals(expectedResult1, FirstNonRepeatedCharacterFunctional(str1));
        assertEquals(expectedResult1, App.FirstNonRepeatedCharacterFunctional(str1));
        String str2 = "hello";
        String expectedResult2 = "h";
        assertEquals(expectedResult2, App.FirstNonRepeatedCharacterFunctional(str2));
    
        
    }
}