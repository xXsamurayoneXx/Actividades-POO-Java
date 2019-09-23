package transporte;

public class Autobus extends ATransporte implements ITransporte{
    private int gasolina; 
    
    public Autobus (){
    
    System.out.println(EncenderMotor());
    
    }
    public Autobus(int gasolina){
    this.gasolina = gasolina;
    System.out.println (this.EncenderMotor());
    }
    
    private String EncenderMotor() {
        return "Autobus Encendido";           
    }

    @Override
    public String SistemaFrenos() {
        return "Autobus Frenado"; 
    }

    @Override
    public String SistemaConducir() {
        return "Autobus Conduciendo"; 
    }
   
    @Override
    public String Acelerar (){
        return "Autobus Acelerado";
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public String Adelante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Atras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Derecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Izquierda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
