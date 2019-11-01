package movil;


public class Movil extends DispositivoMovil{


    public static void main(String[] args) {
        
        
        
        Telefono [] tel=new Telefono[3];
        Radio [] rad=new Radio[3];
        

        for (int i = 0; i < tel.length; i++) {
            tel[i]=new Telefono();
        System.out.println("Telefono: " + i);
        System.out.println(tel[i].Encender());
        tel[i].setMarca("Microsoft");
        tel[i].setModelo("950 XL");
        tel[i].setPrecio("$10, 000");
        System.out.println(tel[i].getMarca());
        System.out.println(tel[i].getModelo());
        System.out.println(tel[i].getPrecio());
        System.out.println(tel[i].HacerLlamada());
        System.out.println(tel[i].ColgarLlamada());
        System.out.println(tel[i].Apagar()); 
        }
        
        for (int j = 0; j < rad.length; j++) {
        rad[j]=new Radio();
        System.out.println("Radio :" + j);
        System.out.println(rad[j].Encender());
        rad[j].setColor("Negro");
        rad[j].setMarca("Nokia");
        rad[j].setModelo("3500");
        System.out.println(rad[j].Radio());
        System.out.println(rad[j].getColor());
        System.out.println(rad[j].getMarca());
        System.out.println(rad[j].getModelo());
        System.out.println(rad[j].CambiarBanda());
        System.out.println(rad[j].CambiarEstacion());
        System.out.println(rad[j].Apagar());
        }
       
        
    }

    @Override
    public String Apagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Encender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
