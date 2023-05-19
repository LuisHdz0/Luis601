
package pkg3.v2trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V2TRIFIV {

  
    public static void main(String[] args) throws IOException {
        //declaracion de variables
         BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
            int numero;
            float mult3;
            float mult5;
        //entrada de datos 
            System.out.println("Dame un Numero ");
            numero= Integer.parseInt(bufEntrada.readLine());
        //procesar datos 
             mult3= numero%3;
             mult5= numero%5;
        //Salida de datos 
             if(mult3 == 0 && mult5== 0){
                 System.out.println("TRIFIV");
                
             }
              else if (mult3==0){
                  System.out.println("TRI");
                 
              }
              else if (mult5==0){
                 System.out.println("FIV");
              }
        
        
        
    }
    
}
