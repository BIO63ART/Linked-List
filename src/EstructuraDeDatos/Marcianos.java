package EstructuraDeDatos;

import java.util.Scanner;
public class Marcianos {
    public static int contarAdu(int Actual,int adultas,int bebes,int H,int M,int T) {
        
       
        if (Actual ==T){
            return adultas;
        }
      int huevosPuestos=adultas*H;
      int huevosAceptados=Math.min(huevosPuestos,M);
       int nuevasAdultas =adultas+bebes;
       int nuevosBebes =huevosAceptados;

        return contarAdu(Actual+1,nuevasAdultas,nuevosBebes,H,M,T);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
          int N=sc.nextInt(); 
         int H=sc.nextInt(); 
          int M=sc.nextInt(); 
           int T=sc.nextInt(); 
           int resultado =contarAdu(0, N, 0, H, M, T);

            
            System.out.println(resultado);
        }

        sc.close();
    }
}