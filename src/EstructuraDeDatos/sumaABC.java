package EstructuraDeDatos;

import java.util.Scanner;
public class sumaABC {
    public static int f (int a,int b,int c){
        int r= (Math.min(a, b));
        int m= (Math.min(r,c));
        
        if (m<=3){
            return a+2*b+3*c;
            
        }else if  (m>3 && (a+b+c==100) ) {
            return 0;
        }else{
            return f(a-1,b-1,c-1)+f(a,b-3,c-3)+f(a/2,b,c);
        }
       
    }
     public static void main (String[]args){
            Scanner sc=new Scanner (System.in);
            int a=sc.nextInt();
             int b=sc.nextInt();
              int c=sc.nextInt();
              
            System.out.println(f(a,b,c));
        }
}
