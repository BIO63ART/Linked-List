import java.util.Scanner;
import java.util.Stack;
public class pilaRI {
   public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
       Stack<Integer> pila = new Stack<>();
       
       int N= sc.nextInt();
       int n= sc.nextInt();
      int t=0;
       
       switch (N){
           case 1: 
                for (int i=1; i<=n; i++){
            pila.push(n);
           t=sc.nextInt();
           
            break;
                }case 2:
                    for (int i=1;i<=i;i++){
                        pila.pop();   
                        break;
       }case 3:
         for (int i=1;i<=i;i++){   
       pila.size();
             System.out.println(pila.size());
       break;
                }
       case 4: 
           for (int i=0;i<=t;i++){
               System.out.println(t);   
           }
       }
       
   }
}