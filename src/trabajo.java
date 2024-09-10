import java.util.Scanner;

public class trabajo {
  public static void main(String[] args) {
    //se declara el array
    String name[];
    
    //Bienvenida al programa
      Scanner input = new Scanner(System.in);
      System.out.println("bienvenidos al programa de gestion de notas del curso");
      System.out.println("_____________________________________________________");
      
      //se pregunta cuantos estudiantes van a registrar en el programa
      System.out.println("ingrese la cantidad de estudiantes que van a registrar");

      //se inicializan las variables para que funcionen correctamente con la proxima estructura
      int j = 0 , numberStudents = 0;
      
      //se utiliza esta estructura para poder recibir un numero valido
      while ( j == 0) {
        numberStudents = input.nextInt();
        
        //si el numero es correcto sale del bucle
        if (numberStudents > 0) {
          j = 1; 
        }

        //si el numero no es correcto continua en el bucle
        else{
          j=0;
          System.out.println("el numero ingresado no es valido, ingrese un numero que sea valido");
        }
        
      }
      
      //se utiliza el for para que el programa se ejecute segun la cantidad de usuarios que allan
      for (int i = 0; i<= (numberStudents-1) ; i++) {
        
        //se pide el nombre del estudiante
        System.out.println("digite el nombre del estudiante 1");
        
         
      }
      input.close();
    }

}
