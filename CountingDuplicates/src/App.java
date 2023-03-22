import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" Enter a string:");
        try (Scanner s = new Scanner(System.in)) {
            String str=s.next();
            System.out.println(countingDuplicates(str));
            System.out.println(countingDuplicatesByGrouping(str));
        }
    }

    //this function returns the results of a map that contains the chars as keys and their occurunces as as values
    public static Map<Character, Integer> countingDuplicates(String str){
        Map<Character, Integer> result=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            result.compute(ch,(k,v) ->(v==null)?1:++v);
        }
        return result;
    }

    //another function with the same functionality 
    public static Map<Character, Long> countingDuplicatesByGrouping(String str){
        Map<Character,Long> result= str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c -> c ,Collectors.counting()));
        return result;

    }
}
