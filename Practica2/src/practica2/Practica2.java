package practica2;
import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        
        /*Se instancia la variable*/
        Calculadora cal = new Calculadora ();
      
        int Suma;
        int m;
        m= cal.Suma(7, 8);
       
        
        int Resta;
        int n;
        n= cal.Resta(7,8);
       
        
        double Division;
        double v;
        v= cal.Division(8.0, 8.0);
       
        
        double Multiplicacion;
        double u;
        u= cal.Multiplicacion(7.0, 8.0);
    
        
        System.out.println("Ingrese a:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        System.out.println("Ingrese b:");
        Scanner sv = new Scanner(System.in);
        int b = sv.nextInt();
        
        //Suma con datos ingresados
        System.out.println("Suma con datos ingresados: " + cal.Suma(a, b));
     
    }
   
    
}
