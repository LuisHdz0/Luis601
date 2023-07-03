/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchfinally;

/**
 *
 * @author Erik Glz
 */
public class TryCatchFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
       float equis=5/0;
       System.out.println("Equis = " +equis);
       }
       catch(ArithmeticException e){
           System.out.println("Error: Divicion entre cero.");
       }finally{
       System.out.println("A pesar de todo , se ejecuta el bloque Finally");
       }
    }
    
}
