import java.util.Scanner; 
import java.util.Stack;
public class Pila {
 
    public static void main(String[] args) {
        Stack <Integer> pila= new Stack <>();
        Scanner sc= new Scanner ( System.in);
        
        System.out.println("Ingrese un numero");
        int n=sc.nextInt();//numero de elementos en la pila
        
        
        System.out.println("Ingrese los elemntos de la pila");
        for (int i=1; i<=n; i++){
            
            int x= sc.nextInt();//Elementos de la pila
            if ( pila.size()<x){
                pila.push(x);
            }else{
                for (int j=1; j<=x;j++){
                    pila.pop();
                }
            }
        }
        System.out.print(pila.size());
        while (!pila.isEmpty()){
            System.out.print(pila.pop()+" ");
        }
    }
    
}
