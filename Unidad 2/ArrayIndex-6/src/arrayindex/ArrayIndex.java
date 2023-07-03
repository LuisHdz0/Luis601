
package arrayindex;

public class ArrayIndex {

 
    public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
        try {
            // Intentamos acceder a un índice fuera del rango del array
            int value = numbers[10];
            System.out.println("El valor es: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }

    }
    
}
