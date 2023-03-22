import java.util.Stack;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println(reverse("ali ibrahim faour"));
    }
    public static String ReverseStringSimp(String str){
        char [] chars=new char[str.length()];
        String revStr="";
       for (int i = str.length()-1; i >=0; i--) {
            chars[i]=str.charAt(i);
       }
       for (int i = str.length()-1; i >=0; i--) {
        revStr+=chars[i];
   }
   return revStr;
        

            
        
        
    }
    public static String reverseUsingStack(String str){
        final Stack<Character> col= new Stack<>();
        String revstr="";
        for (char c : str.toCharArray()) {
            col.push(c);
        }
       for (int i = 0; i < str.length(); i++) {
            revstr+=col.pop();
       }
       return revstr;
    }
    private static final String WHITESPACE=" ";
    
    public static String reverseWords(String str) {
        String[] words = str.split(WHITESPACE);
        
        StringBuilder reversedString = new StringBuilder();
        for (String word: words) {
            System.out.println(word);   
        StringBuilder reverseWord = new StringBuilder();
            System.out.println(word);
            for (int i =word.length()-1 ; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
                
            }
             reversedString.append(reverseWord).append(WHITESPACE);
        }
        
        return reversedString.toString();
        }
        private static final Pattern PATTERN=Pattern.compile(" +");
        public static String reverseFunctional(String str){
            return PATTERN.splitAsStream(str).map(w->new StringBuilder(w).reverse()).collect(Collectors.joining(" "));
        }
        public static String reverse(String str){
            return new StringBuilder(str).reverse().toString();
        }

}

