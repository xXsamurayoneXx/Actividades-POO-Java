package practica3;
import java.util.Scanner;
public class Transporte {

    public static void main(String[] args) {
      
       Autobus dina = new Autobus();
       dina.setGasolina(9);
       Autobus inter = new Autobus ();
       System.out.println (inter.Acelerar());
       
       //Se recibe la gasolina
       System.out.println("Ingrese la gasolina:");
       Scanner sc = new Scanner(System.in);
       int gas = sc.nextInt();
       
       //Se valida la gasolina
       if (gas >= 1){
       Automovil aut = new Automovil ();
            System.out.println (aut.Acelerar());
            System.out.println (aut.SistemaConducir());
            System.out.println (aut.SistemaFrenos());
            System.out.println (aut.ApagarMotor());
       }
       
       if (gas < 1){
            System.out.println("Gasolina del automovil insuficiente");
       }
       
       System.out.println ("MENU DE MOVIMIENTO");
       System.out.println ("Presione la tecla corresponditente para dirigir al automovil");
       System.out.println ("1) Adelante");
       System.out.println ("2) Atras");
       System.out.println ("3) Derecha");
       System.out.println ("4) Izquierda"); 
       
       Scanner mo = new Scanner(System.in);
       int mov = mo.nextInt();
           
           
       if (mov==1){
            Automovil aut = new Automovil ();
            System.out.println (aut.Adelante());
       }
       
       if (mov==2){
            Automovil aut = new Automovil ();
            System.out.println (aut.Atras());
       }
       
       if (mov==3){
            Automovil aut = new Automovil ();
            System.out.println (aut.Derecha());
       }
       
       if (mov==4){
            Automovil aut = new Automovil ();
            System.out.println (aut.Izquierda());
       }
    }
    
}
