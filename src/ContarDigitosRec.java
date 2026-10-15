import java.util.Scanner;
public class ContarDigitosRec {
    public static int contar (int d ){
     
        if (d/10==0){
            return 1;
        }else{
            return 1+contar(d/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int d=sc.nextInt();
        
        System.out.println(contar(d));
    }
}
