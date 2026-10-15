public class List {
 
    private Node head;       //Nodo cabeza o inicio de la lista
    private Node tail;//Nodo cola o final de la lista
    private int length;  //tamaño actual de la lista
    
    class Node{ //El primer nodo 
        int value; //valor que voy a guardar
        Node next; //puntero
        public Node(int value){  
            this.value=value; 
        }
    }
    
    //Constructor que crea el primer nodo
    public List (int value){
        Node newNode=new Node(value);
        length=1;
        head=newNode;
        tail=newNode;
    }
    public void getHead(){  //valor del inicio de la lista
        System.out.println("Head:" + head.value); 
    }
    public void getTail(){  // valor del final de la lista
        System.out.println("Tail:" + tail.value); 
    }
    public void getLength(){ //tamaño  de la lista
            System.out.println("Length:" + length);  
    }
    public void append(int value){ //agrwga un elemento al final de la lista
        if(length==0){
            Node newNode=new Node(value);
            length=1;
            head=newNode;
            tail=newNode;
            return;
        }
        Node newNode=new Node(value);
        tail.next=newNode;
        tail=newNode;
        length++;
    }
    public void printList(){        //imprime la lista completa
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public Node removeLast(){ //quita el último elemento de la lista
        if(length==0){   //si la lista no tiene elementos el valor es nulo 
            return null;
        }
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){ //recorre y compará lo que hará mientras  el puntero sea diferente a null
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
public Node removeFirst () { // Quita el primer elemento de la lista 
        if (length == 0) {
            return null;     
        }
        Node temp=head;  // Guardamos el nodo actual para retornarlo
        head=head.next;// movemos el head al siguiente nodo
        temp.next=null;   // quitamos  el nodo eliminado
        length--;  // se reduce el tamaño
        
        if (length==0) {// Si era el unico nodo la cola tambien se vuelve nula
            tail=null;
        }
        return temp;  // regresamos el nodo que quitamos
    }
    
    
    
   public boolean insert(int in, int value){ //inserta en el indice que le indiquemos 
        if (in<0 || in>length){
            return false; /* compara el tamaño del indice y si es menor a cero o mayor al total de lementos entonces 
             devuelve false por estar  fuera del rango
            */
        }
        if (in==0) { //si indice es 0 entonces se inserta al inicio de la lista
            
            Node nvN=new Node(value);
            nvN.next=head;
            head =nvN;
            if (length==0) {
                tail=nvN; //si estaba vacia tail y head apuntan al nuevo
            }
            length++;
            return true;
        }
        if (in==length) {
            append(value);
            return true;
        }
        // Si el indice es igual al length lo agregamos al final usando el append
        Node nvN= new Node(value);
        Node temp=head;
        for (int i=0; i<in-1; i++){
            temp=temp.next;
        }
        
        nvN.next=temp.next;//aca se reemplazan los punteros para poner el nuevo nodo en medio
        temp.next=nvN;
        length++;
        return true;
    }
   // si va en medio se crea el nodo y se recorre hasta el nodo anterior por eso esta el index-1
    public void reverse(){ //metodo para revertir la lista
        Node temp=head;
        head =tail;
        tail=temp;
        
        // punteros auxiliares para cambiar la dirección de los enlaces
        Node aux1=null; 
        Node aux2=null;
        
        for (int i=0; i < length; i++) {
            aux1=temp.next; //se guarda el nodo siguiente pero solo por poco tiempo
            temp.next=aux2; //aqui se invierte el puntero para que apunte hacia atras
            aux2=temp; //se mueve el auxiliar 2 un paso a tras
            temp=aux1; //se mueve este nodo al siguiente que guardamos
        }
    }
    public Node encontrarNodoMedio(){//para encontrar el nodo de en medio
        Node len=head;//avanza 1 paso (len de lento)
        Node rap=head;//avanza 2 pasos (rap de rapido)
        
        while (rap !=null && rap.next != null){//mientras el puntero rap no llegue al final de la lista sigue avanzando len
            len=len.next;
            rap=rap.next.next; 
        }
        return len; 
        //Cuando rap llega al final len se esta en la mitad
        
    }
    public boolean ciclado(){ //Metodo para saber si se cicla 
        Node lento=head;
        Node rapido=head;
        
        while (rapido !=null && rapido.next!=null){
            lento=lento.next;  //avanza 1 paso
            rapido =rapido.next.next;  //avanza 2 pasos
            
            if (lento==rapido){
                return true; // Se encontraron hay un ciclo
            }
        }
        return false; // llego a null no hay ciclo
    }
}