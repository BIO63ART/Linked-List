import java.util.Scanner; 
public class sumaRec {
    public static int Suma(int n){
        
        if (n==1){
            return 1; 
        }else if (n>=1){
          return n+Suma(n-1); 
        }else{
            return 0;
        }
    
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println( Suma(n));
    }
}
