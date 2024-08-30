import java.util.regex.*;
class RegExDemo2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[A-Za-z0-9_-]{5,10}");
        Matcher m = p.matcher(args[0]);
        System.out.println(m.matches());        
    }    
}
