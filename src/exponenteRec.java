import java.util.Scanner;
public class exponenteRec {
    public static int base(int b,int exp){
    
        if (exp==0){
            return 1;
        }else if (exp<0){
             return 0;
        }else{
          return b*base(b,exp-1);
        }
        
}
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int b= sc.nextInt();
        int exp=sc.nextInt();
        System.out.println(base(b,exp));
    }
}
