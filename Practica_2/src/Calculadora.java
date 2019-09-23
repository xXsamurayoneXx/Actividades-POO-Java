public class Calculadora implements Icalculadora{
      int a=3;
      int b=2;
    public int Suma (int a, int b) {
        int S;
        S = a + b;
        System.out.write(S);
        return (S);
    }
   public int Resta (int a, int b) {
       int R;
       R = a - b;
       System.out.println(R);
       return (R);
   }      
   
    /*Se ponen los metodos de la interface*/
   
    @Override
    public double Division(double a, double b) {
      double D;
      D = a / b;
      System.out.println(D);
      return (D);  
    }

    @Override
    public double Multiplicacion(double a, double b) {
      double M;
      M = a * b;
      System.out.println(M);
      return (M);
    } 
}
