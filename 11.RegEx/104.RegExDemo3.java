import java.util.regex.*;
class RegExDemo3 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@%#$]).{8,20})");
        try{
            Matcher m = p.matcher(args[0]);
            System.out.println(m.matches());      
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Please, enter the argument");
        }
    }    
}
