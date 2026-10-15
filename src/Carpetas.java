import java.util.Scanner;
import java.io.File;

public class Carpetas{
    public static void main(String[]args){
      Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese una ruta:");
        String ruta= sc.nextLine();

        File krpeta= new File(ruta);

        if (krpeta.exists() && krpeta.isDirectory()){
            recorrer(krpeta, 0);
        } else{
           System.out.println("no existe");
      }
    }
    public static void recorrer(File carpeta, int nivel){ 
        String san= ""; 
        for (int i=0; i< nivel; i++){
            san += "    ";
        }

        System.out.println(san+ "[Carpeta] " + carpeta.getName());
        File[] elementos=carpeta.listFiles();

        if (elementos != null) {
            for (File elem : elementos){
                if (elem.isDirectory()){
                  recorrer(elem, nivel + 1);
              } else if (elem.isFile()){
              System.out.println(san + "    [Archivo] "+ elem.getName());
         }
       }
     }
    }
}     
    
   