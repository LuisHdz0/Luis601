
package nullpointer.pkg9;

public class NullPointer9 {

 
    public static void main(String[] args) {
         String text = null;
        
        try {
            int length = text.length(); 
               // Intentamos acceder a un método de un objeto nulo
            System.out.println("La longitud del texto es: " + length);
        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
    
}
