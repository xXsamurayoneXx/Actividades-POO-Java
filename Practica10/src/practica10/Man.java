package practica10;


public class Man extends SuperMan{

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getAtaque() {
        return Ataque;
    }

    public void setAtaque(int Ataque) {
        this.Ataque = Ataque;
    }
    
    public int getMana() {
        return Mana;
    }

    public void setMana(int Mana) {
        this.Mana = Mana;
    }
    
    public double getVida() {
        return Vida;
    }

    public void setVida(double Vida) {
        this.Vida = Vida;
    }
    
    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public double getDefensa() {
        return Defensa;
    }

    public void setDefensa(double Defensa) {
        this.Defensa = Defensa;
    }
    
    public char getAtEsp() {
        return AtEsp;
    }

    public void setAtEsp(char AtEsp) {
        this.AtEsp = AtEsp;
    }
    
    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }
    
    private String Edad;
    private String Nombre;
    private int Ataque;
    private int Mana;
    private double Vida;
    private String Tipo;
    private double Defensa;
    private char AtEsp;
    private double Velocidad;
    
    
    
    public Man(){
        
    }
    
    public String caminar (){
      return ("Caminar");  
    }
    
    public String correr (){
      return ("Correr");  
    }
    
    public String original(){
        return ("Tipo normal");
    }
    @Override
    public String SuperFuerza() {
        return ("Super fuerte");
    }
    
}
