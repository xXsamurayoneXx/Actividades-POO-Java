package practica3;

public interface ITransporte {
    public String SistemaFrenos();
    public String SistemaConducir();
    public abstract String Adelante ();
    public abstract String Atras ();
    public abstract String Derecha ();
    public abstract String Izquierda ();
}
