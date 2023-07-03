
package ioexeption.pkg10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IoExeption10 {

 
    public static void main(String[] args) {
      BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("archivo.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }
    
}
