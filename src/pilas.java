import java.util.Stack;
import java.util.Scanner;
public class pilas {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        Stack<String> pila = new Stack<>();
        Stack<String> pilB = new Stack<>();
        
        String n;

        System.out.println("Cuantos elementos quieres agregar");
        int e=sc.nextInt();
        
        for (int i=1;i<=e;i++){
           n=sc.next();
             pila.push(n);
        }
        System.out.println("Tamanio: "+pila.size());
        System.out.println("elemento: "+pila.peek());
        System.out.println("Sacar elemento: "+pila.pop());
        System.out.println("Esta vacia: "+pila.empty());
        System.out.println("tamanio nuevo: "+pila.size());
        System.out.println(" ");
        
        
       while ( !pila.empty()){
            String elemento =pila.pop();
           System.out.print(elemento);
           pilB.push(elemento);
          
          
        }
       

       
    }
}