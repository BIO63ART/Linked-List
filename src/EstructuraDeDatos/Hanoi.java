 package EstructuraDeDatos;

import java.util.Scanner;
public class Hanoi{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
            int t=sc.nextInt();
            for (int i=0;i<t; i++) {
              int n=sc.nextInt();
               char origen=sc.next().charAt(0);
                char destino=sc.next().charAt(0);
                
                char aux;
                if ((origen=='A'&&destino=='B') || (origen=='B'&&destino=='A')){
                    aux = 'C';
              } else if ((origen=='A'&&destino=='C')|| (origen=='C'&&destino=='A')){
                    aux='B';
               } else {
                    aux='A'; 
              }
                hanoi(n, origen, destino, aux);
                System.out.println("Listo!");
            }
    }
    public static void hanoi(int n, char origen, char destino, char aux) {
        if (n==1) {
            System.out.println("Mueve el disco de " +origen +" a "+ destino);
            return;
        }
        hanoi(n - 1,origen, aux, destino);
        System.out.println("mueve el disco de " +origen + " a "+destino);
        hanoi(n - 1, aux, destino, origen);
    }
}