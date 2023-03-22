public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(countOccurences_Fast("kamdlkadwnoncoani", 'a'));
    }

    public static int countOccurences(String str,String ch){
        if(ch.codePointCount(0, ch.length())>1){
            return -1;
        }
        int result=str.length()-str.replace(ch, "").length();
        return ch.length()==2?result/2:result;

        
    }
    public static int countOccurences_Fast(String str,char ch){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i) == ch){
                count++;
            }
            
        }
        return count;
    }
}
