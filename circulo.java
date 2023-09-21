import java.util.Scanner;

public class circulo {
   public static void main(String[] args) {

     Scanner scanner=new Scanner (System.in);
     double a,r; //area y radio
      System.out.println("introduce el radio de un circulo");
       r=scanner.nextDouble();
        a=Math.PI*(r*r);   //para elevar al cuadrado

        System.out.println( "El area de un circulo  "  +  r  +   " es : "  +   a); 
   }
      }
    