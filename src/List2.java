
public class List2 {
   public static void main(String[] args) {
        List ll=new List(10);
        System.out.println("lista de prueba");
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.printList();
        System.out.println(" ");
       
        System.out.println("DATOS ADICIONALES");
        ll.getHead();
        ll.getTail();
        ll.getLength();
        System.out.println("Probando REMOVE 50");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 40");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 30");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 20");
        System.out.println( ll.removeLast().value );
                System.out.println("Probando REMOVE 10");
        System.out.println( ll.removeLast().value );
        System.out.println("Probando REMOVE vacio");
        System.out.println( ll.removeLast() );
        System.out.println("----------------------------------------------------------------------------------------------");
       System.out.println("IMPRIME LISTA NUEVA");
       
        ll.append(100);
        ll.append(200);
        ll.append(800);
        ll.append(300);
        ll.append(400);
        ll.append(500);
        
        ll.printList();
        
        System.out.println("Quita el ultimo elemento de la lista");
        System.out.println(ll.removeLast().value);
        System.out.println("Quita el primer elemento");
       System.out.println(ll.removeFirst().value);
      
       System.out.println("inserta un nuevo numero");
       System.out.println(ll.insert(3, 2007));
       ll.printList();
       System.out.println("Reversea la fila");
       ll.reverse();
      ll.printList();
       System.out.println("Encontrar el numero de en medio de la lista");
       System.out.println(ll.encontrarNodoMedio().value);
       System.out.println("La lista esta ciclada?");
       System.out.println(ll.ciclado());
      
    }
   
}
  

