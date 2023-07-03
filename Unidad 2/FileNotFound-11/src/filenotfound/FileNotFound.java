
package filenotfound;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {

  
    public static void main(String[] args) {
              try {
            File file = new File("archivo.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
    }
    
}
