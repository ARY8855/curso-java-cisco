package tp1;

import java.util.Scanner;

/**
 *
 * @author Ary
 */
public class CortarCadena {
    public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese su texto: ");
    
    String texto = s.nextLine();
        
    int longitud = texto.length();
    int mitad = longitud/2;
    
    String parte1 = texto.substring(0, mitad);    
    String parte2 = texto.substring(mitad, longitud);
    
    System.out.println("La primer parte es: "+ parte1 +"\nLa segunda parte es: "+ parte2);
    }
}