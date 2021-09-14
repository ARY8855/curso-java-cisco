package tp1;//del paquete TP1 que cree al inicio

import java.util.Scanner;//importador de scanner

/**
 *
 * @author Ary
 */
public class CortarNombre {//clase creada automaticamente
    public static void main(String[] args) {//main
    
    System.out.println("Ingrese su nombre y apellido separado por espacio: ");//pedido por pantalla
    Scanner s = new Scanner(System.in);//lee pantalla
    String nombre = s.nextLine();//asigna linea a nombre
    
    int posicion = nombre.indexOf(' ');//buscar la posicion del espacio
    
    int longitud = nombre.length();//longitud total
    
    String parte1 = nombre.substring(0, posicion);//inicio al espacio
    String parte2 = nombre.substring(posicion, longitud);//espacio al final
    
    System.out.println("El nobmre es: "+ parte1 +"\nEl apellido es:"+ parte2);//mostrar por pantalla
    }
}