package movil;


public class Telefono extends DispositivoMovil{
    
    private String precio;
    private String marca;
    private String modelo;
    
    public String HacerLlamada ()
    {
        return "LLamando";
    }
    public String ColgarLlamada ()
    {
        return "Colgando";
    }


    public String getPrecio() {
        return precio;
    }


    public void setPrecio(String precio) {
        this.precio = precio;
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

    @Override
    public String Apagar() {
        return "Apagando Telefono";
    }

    @Override
    public String Encender() {
        return "Encendiendo Telefono";
    }
    
    
}
