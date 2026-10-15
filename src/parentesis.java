 import java.util.Scanner;
import java.util.Stack;
public class parentesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        String s = sc.next();
        Stack<Character> p = new Stack<>();
        boolean ok= true;
        
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                p.push(c);
            } else {
                if (p.isEmpty()) {
                    ok =false;
                    break;
                }
                
                char top = p.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    ok = false;
                    break;
                }
            }
        }
        
        if (ok && p.isEmpty()) {
            System.out.println("Balanceado");
        } else {
            System.out.println("No balanceado");
        }
        
       
    }
}   

