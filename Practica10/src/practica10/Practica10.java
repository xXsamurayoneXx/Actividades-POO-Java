package practica10;

public class Practica10 extends Man{

    public static void main(String[] args) {
       Man superHombre = new Man();
       
       superHombre.setNombre("Paco");
       superHombre.setEdad("5");
       superHombre.setTipo("Normal");
       superHombre.setVida(10.5);
       superHombre.setMana(10);
       superHombre.setAtEsp('b');
       superHombre.setAtaque(5);
       superHombre.setDefensa(23.2);
       superHombre.setVelocidad(7.2);
       
      
       try {
           
    
       Man[] sh = new Man [3];
       //Numero
       int [] j = new int [3]; 
       //Clan
       String[] a = new String [3];
       //valor de personaje
       double [] d = new double [3];
       //Legion
       char [] c = new char[3];
       
        for (int i = 0; i < 3; i++) {
            sh[i] = new Man();
            j[i] =  i;
            System.out.println("Nueva creacion numero: " + j[i]);
            a[i] = "Clan: Leonidas";
            System.out.println(a[i]);
            d[i] = i;
            System.out.println("Valor de personaje" + d[i]);
            c[i] = 'S';
            System.out.println("Legion: " + c[i]);
            sh[i].setNombre("Nuevo Humano" + Integer.toString(i));
            sh[i].setEdad("0" + Integer.toString(i));
            sh[i].setTipo("Lucha");
            sh[i].setVida(100.9);
            sh[i].setDefensa(50.3);
            sh[i].setVelocidad(15.5);
            sh[i].setMana(100);
            sh[i].setAtaque(20);
            sh[i].setAtEsp('A');
            
        }
       Man[] sho = ImprimirArreglo(sh);
       ImprimirArre(sh);
       
       
    }
       
       catch (Exception ex){
          System.out.print(ex.getMessage());
       }
    }

    
    
    public static Man[] ImprimirArreglo(Man[] m){
        
     return m;   
    }
    
    
    public static void Imprime (Man[] m){
    for (Man n: m){
       
        System.out.println(n.getNombre());
        System.out.println(n.getTipo());
        System.out.println(n.getAtaque());
        System.out.println(n.getAtEsp());
        System.out.println(n.getDefensa());
        System.out.println(n.getVelocidad());
        System.out.println(n.getEdad());
        System.out.println(n.getVida());
        System.out.println(n.getMana());
    }
    }
    
    public static void ImprimirArre(Man[] m){
    for (Man n: m){
        //metodoDeImprimir()
  
        System.out.println(n.getNombre() + " " + n.brincaMasAlto() + " " + n.SuperFuerza() + " " + n.Evolucion() + " " + "Edad: " + n.getEdad() + " " + "Vida: " + n.getVida() + " " + "Mana: " + n.getMana() + " " + "Velocidad: " + n.getVelocidad() + " " + "Ataque Especial tipo: " + n.getAtEsp() + " " + "Poder de ataque: " + n.getAtaque() + " " + "Poder de Defensa: " + n.getDefensa());//en vez de usar esto usar un metodo que lo imprima
    }
    }
    
    
}
