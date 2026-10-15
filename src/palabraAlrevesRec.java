import java.util.Scanner;
public class palabraAlrevesRec {
 public static boolean palabra (String p){
     
    if (p.length() <= 1) {
            return true;
        }
        if (p.charAt(0) != p.charAt(p.length() - 1)) {
            return false;
        }
        return palabra(p.substring(1, p.length() - 1));
    }

    public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
      String p=sc.next();
        System.out.println(palabra(p)); // true
       
    }
}