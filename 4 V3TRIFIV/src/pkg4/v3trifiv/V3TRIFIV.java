
package pkg4.v3trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class V3TRIFIV {

   
    public static void main(String[] args) throws IOException {
         BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
            int numero;
             //entrada de datos 
          System.out.println("Dame un Numero ");
            numero= Integer.parseInt(bufEntrada.readLine());
            //Salida de datos 
            
            System.out.println(retornaMultiplo(numero));
    }
    public static String retornaMultiplo (int num){
         //declaracion de variables
            float mult3;
            float mult5;
            
             //procesar datos 
             mult3= num%3;
             mult5= num%5;
        //Salida de datos 
             if(mult3 == 0 && mult5== 0){
                 return"TRIFIV";
                
             }
              else if (mult3==0){
                return"TRI";
                 
              }
              else if (mult5==0){
                return"FIV";
              }
    
    return "Ningun valor ";
            }
    
}
