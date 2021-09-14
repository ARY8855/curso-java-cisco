package tp1;

import java.util.Scanner;

/**
 *
 * @author Ary
 */
public class Suma {
    public static void main(String[] args) {     
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese numero A: "); 
        int x = s.nextInt();
        System.out.println("Ingrese numero B: ");
        int y = s.nextInt();
        System.out.println("La suma de A + B = " + Integer.sum(x, y));//////////////////////////////////////!
    }
}