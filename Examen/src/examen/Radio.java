package movil;


public class Radio extends DispositivoMovil{
    private String marca;
    private String modelo;
    private String color;
 
    public int Radio (){
       int Banda = 1;
       return Banda;
    }
            
    public String CambiarEstacion ()
    {
        return "Cambiando estacion";
    }
    public String CambiarBanda ()
    {  
        return "Cambiando banda";
    }

    @Override
    public String Apagar() {
        return "Apagando Radio";
    }

    @Override
    public String Encender() {
        return "Encendiendo Radio";
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getColor() {
        return color;
    }

    
    public void setColor(String color) {
        this.color = color;
    }
}
