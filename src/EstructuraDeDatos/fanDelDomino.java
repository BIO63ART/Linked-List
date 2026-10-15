package EstructuraDeDatos;

import java.util.Scanner;
public class fanDelDomino {
    public static int fun(int n){
        
        if (n==0 || n==1)return 1;
          int a=1,b=1,c=0;
          
        for (int i=2;i<=n;i++){
    
            c=a+b;
            a =b;
            b =c;
        }
        return b;
}
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
            System.out.println(fun(n));
    
        }
}