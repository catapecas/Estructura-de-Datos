package Clase9;

public class Recursividad1 {

    public static void main(String[] args) {
        cuentaRegresiva(10);

    }
    public static void cuentaRegresiva(int n) {

        //caso base
        if (n == 0) {
            System.out.println("¡Despegue!");
            return;
        } 
         //caso recursivo
         System.out.println(n);
         cuentaRegresiva(n - 1);

    }
    
}
