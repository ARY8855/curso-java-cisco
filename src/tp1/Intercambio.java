package tp1;

/**
 *
 * @author Ary
 */
public class Intercambio {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;
        
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        
        int c = a;
        a = b;
        b = c;
        
        System.out.println("\t");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}