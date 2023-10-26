package hola;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Ingrese un n: ");
        int n = sc.nextInt();

     
  
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }

       
        System.out.println("La suma de 1 a " + n + " es: " + suma);
    }
}
