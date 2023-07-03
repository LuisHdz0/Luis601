
package classnotfound.pkg8;

public class ClassNotFound8 {

 
    public static void main(String[] args) {
      try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
        
     
    }
    
}
