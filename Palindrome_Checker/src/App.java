import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while (right>left) {
            if (str.charAt(left)!=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
            
        }
        return true;
    }

    public static boolean isPalindromeIterate(String str){
        int n=str.length();
        for (int i = 0; i < n/2; i++) {
            if(str.charAt(i)!=str.charAt(n-1-i))
                return false;
        }
        return true;
    } 

    public static boolean isPlaindromeAPI(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static boolean isPalindromefunctional(String str){
        return IntStream.range(0,str.length()/2).noneMatch(p->str.charAt(p)!=
        str.charAt(str.length()-p-1));
    }
}
