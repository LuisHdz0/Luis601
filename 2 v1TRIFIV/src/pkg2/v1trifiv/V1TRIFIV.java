/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.v1trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS-10
 */
public class V1TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
        int numero;
        float mult3;
        float mult5;
        System.out.println("Dame un Numero ");
        numero= Integer.parseInt(bufEntrada.readLine());
        mult3= numero%3;
        mult5= numero%5;
        if(mult3==0){
            System.out.println("TRI");
            
    }
            if(mult5==0){
            System.out.println("FIV");
            
    }
                if(mult3==0 && mult5==0){
            System.out.println("TRI-FIV");
            
    }
            
    }
    
}
    