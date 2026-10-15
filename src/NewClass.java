import java.util.Scanner;
import java.util.Stack;

public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return; //lector que recibe lo que ingresa el usuario
        int m = sc.nextInt();
        
        Stack<Integer> pila = new Stack<>();
        
        for (int i = 0; i < m; i++) { //crea la pila donde guarda los colores del plato
            int op = sc.nextInt();
            
            if (op == 1) {
                int v= sc.nextInt();
                pila.push(v);
            } else if (op == 2) {
                pila.pop();
            } else if (op == 3) {
                System.out.println(pila.size());
            } else if (op == 4) {
                System.out.println(pila.peek());
            }
        }
        
        sc.close();
    }
}