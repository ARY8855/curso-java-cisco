package tp1;

import java.util.Scanner;

/**
 *
 * @author Ary
 */
public class NombreApellido {
    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    System.out.println("Ingrese su nombre: "); 
    String nombre = s.next();
    
    System.out.println("Ingrese su apellido: ");
    String apellido = s.next();
    
    System.out.println("Nombre completo: " + nombre + " " + apellido);
    }
}