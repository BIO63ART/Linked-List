import java.util.PriorityQueue;
import java.util.Scanner;
public class priortityQ {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
  PriorityQueue <Integer> pq= new PriorityQueue<> ();
  pq.add(1);
  pq.add(2);
  pq.add(3);
  pq.add(4);
  
        System.out.println("Cantidad de elementos de la Queue");
        System.out.println(pq.size());
          
        System.out.println("elementos de la Queue");
        PriorityQueue <Integer> copia= new PriorityQueue<>(pq);
        while (!copia.isEmpty()){
            System.out.println(copia.poll()+" ");
            
        }
       
        System.out.println("Numero de la cima en la Queue");
        System.out.println(pq.peek());//para consultar la cima pero no lo borra 
        System.out.println("El elemnto existe?");
        System.out.println(pq.contains(3)); //revisa si existe el elemento
        System.out.println("Elimina el elemento menor y lo actualiza");
        System.out.println(pq.poll());
        System.out.println("Lista actualizada");
        System.out.println(pq.size()); //3 porque eliminó el 1
        System.out.println("elimina el elemento que yo diga pq soy la jefa");
        System.out.println(pq.remove(4));
        System.out.println(" la fila esta vacia");
        System.out.println(pq.isEmpty());//devuelve un true o false 
        System.out.println("--------Limpiar la lista con pq.clear()-------");
        pq.clear();
        System.out.println("La lista esta vacia");
        System.out.println(pq.isEmpty());
        System.out.println(" ");
        
        PriorityQueue <Integer> qp=new PriorityQueue <>();
        System.out.println("-------Ingrese la cantidad de elementos que quiere en su lista------");
        int n=sc.nextInt();
        
        for (int i=1;i<=n;i++){
            qp.add(i);
        }
             PriorityQueue <Integer> cop= new PriorityQueue<>(qp);
        while (!cop.isEmpty()){
            System.out.println(cop.poll()+" ");
            
      }
     }
    }
