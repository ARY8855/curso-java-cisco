package tp1;

import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {
         
    System.out.println("Ingrese cadena: ");//ingresa texto
    Scanner s = new Scanner(System.in);//lee texto por teclado
    
    String texto = s.nextLine();//guarda texto
        
    int longitud = texto.length();//calcula logitud
    
    System.out.println("La longitud es de: "+ longitud +" letras.");//muestra longitud
    }
}