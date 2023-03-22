import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        String c=FirstNonRepeatedCharacterFunctional("awdasdawasawdasaddsdawdasdawl");
        System.out.println(c);
    }

    public static final int EXTENDED_ASCII_CODES=256;
    public static char FirstNonRepeatedCharacter(String str){
       int [] flags =new int[EXTENDED_ASCII_CODES];
    for(int i=0;i<flags.length;i++){
        flags[i]=-1;
       } 
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(flags[ch]==-1)
            flags[ch]=i;
        else  
            flags[ch]=-2;
       }
       int position=Integer.MAX_VALUE;
       for(int i=0;i<EXTENDED_ASCII_CODES;i++){
        if(flags[i]>=0){
            position=Math.min(position,flags[i]);
        }
       }
       return position==Integer.MAX_VALUE? Character.MIN_VALUE:str.charAt(position);
    }
   
    public  static char FirstNonRepeatedCharacterMap(String str){
            Map<Character,Integer>chars=new LinkedHashMap<>();
            for (char ch : str.toCharArray()) {
                

                chars.compute(ch,(k,v)->(v==null)?1:++v);
            }
            for(Map.Entry<Character,Integer>entry:chars.entrySet()){
                if(entry.getValue()==1){
                    return entry.getKey();
                }
            }
            return Character.MIN_VALUE;
            
    }
    public static String FirstNonRepeatedCharacterFunctional(String str){
        Map<Integer,Long>chars= str.codePoints().mapToObj(cp->cp)
        .collect(Collectors.groupingBy(Function.identity(),
        LinkedHashMap::new,Collectors.counting()));
        int cp=chars.entrySet().stream().filter(e->e.getValue()==1L)
        .findFirst().map(Map.Entry::getKey).orElse(Integer.valueOf(Character.MIN_VALUE));
        return String.valueOf(Character.toChars(cp));
    }
}
