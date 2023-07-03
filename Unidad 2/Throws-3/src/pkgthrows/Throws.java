
package pkgthrows;

public class Throws {

    public static void main(String[] args) {
       try{
       int divicion = miMetodo(10,0);    
       System.out.println(divicion);
       }catch(ArithmeticException e){
       
       System.out.println("Excepcion aritmetica arrojada");
       }
    }
    public static int miMetodo(int a, int b) throws ArithmeticException{
        int c= a/b;
        return c;
    }

    }
    
