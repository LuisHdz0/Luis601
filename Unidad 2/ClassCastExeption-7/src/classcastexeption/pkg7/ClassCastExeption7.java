
package classcastexeption.pkg7;

public class ClassCastExeption7 {

 
    public static void main(String[] args) {
          try {
            Object obj = "Hola mundo";
            Integer number = (Integer) obj; // Intentamos hacer un casting incorrecto
            System.out.println("El número es: " + number);
        } catch (ClassCastException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
        
       
    }
    
}
