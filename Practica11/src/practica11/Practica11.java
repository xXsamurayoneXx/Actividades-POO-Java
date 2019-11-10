package practica11;

public class Practica11 {

    public static void main(String[] args) {
        NewClass i = new NewClass();
        int j = i.convertidorSTI("123");
        System.out.println("Funcion String to int: " + " " + j);
        //int j1= i.longitud("2341");
        System.out.println(i.longitud("Cantidad" + "234"));
        //String[] lst = new String [10];
        String[] lst = {"Java" + "Lanix" + "Jesus" + "Carlos" + "Sam" + "Juan" + "Javier" + "Casa" + "Julian" + "Ilda"};
        String[] b = i.cntainsnum(lst);
     
        for (String a: b) {
           System.out.println(a);
        }
        
   
    }
    
}
