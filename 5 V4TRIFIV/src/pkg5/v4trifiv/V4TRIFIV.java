
package pkg5.v4trifiv;

import funciones.funcionMutiplo;
import static funciones.funcionMutiplo.retornaMultiplo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V4TRIFIV {

    public static void main(String[] args) throws IOException {
        //declaracion de variables
         BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
         int numero ;
         // creo objeto 
         funcionMutiplo mult = new funcionMutiplo();
         //entrada datos
         System.out.println("Dame un numero ");
         numero= Integer.parseInt(bufEntrada.readLine());
         //ssalida de datpos 
           System.out.println(retornaMultiplo(numero));
    }
    
}
