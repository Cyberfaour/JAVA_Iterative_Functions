public class App {
    public static void main(String[] args) throws Exception {
        
    }
    public static boolean containsOnlyDigits(String str){
        if(str==null){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean containsOnlyDigitsFuncional(String str){
        if(str==null)
        return false;
        return !str.chars().anyMatch(n->!Character.isDigit(n));
    }

    public static boolean containsOnlyDigitsRegex(String str){
        if(str==null) return false;
        return str.matches("[0-9]+");
    }
}
