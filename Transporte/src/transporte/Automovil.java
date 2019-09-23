package transporte;
import java.util.Scanner;


public class Automovil extends ATransporte implements ITransporte{

    @Override
    public String Adelante () {
        return "Automovil se mueve hacia adelante";
    }
    
    @Override
    public String Atras () {
        return "Automovil se mueve hacia atras";
    }
    
    @Override
    public String Derecha () {
        return "Automovil se mueve hacia la derecha";
    }
    
    @Override
    public String Izquierda () {
        return "Automovil se mueve hacia la izquierda";
    }
    
    @Override
    public String Acelerar() {
        return "Automovil Acelerando"; 
    }
  
    @Override
    public String SistemaFrenos() {
        return "Automovil Frenado";
    }
 

    @Override
    public String SistemaConducir() {
        return "Autobus Conduciendo";
    }
}
//Hacer funvionar automovil validando gasolina, plus: que se mueva izquierda derecha//