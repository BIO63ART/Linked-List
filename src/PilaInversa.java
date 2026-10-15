import java.util.Scanner;
import java.util.Stack;
public class PilaInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String e = sc.next();
            switch (e) {
                case "AGREGA":
                    int v = sc.nextInt();
                    pila.push(v);
                    break;
                case "QUITA":
                    System.out.println(pila.pop());
                    break;
                case "INVIERTE":
                    Stack<Integer> aux= new Stack<>();
                    while (!pila.isEmpty()) {
                        aux.push(pila.pop());
                    }   pila = aux;
                    break;
                default:
                    break;
            }
        }
    }
}