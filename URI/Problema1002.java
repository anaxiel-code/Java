import java.io.IOException;
import java.util.Scanner;

 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Problema1002 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        double PI= 3.14159;
        double raio = sc.nextDouble();
        double area = Math.pow(raio, 2)*PI;
        System.out.printf("A=%.4f",area);
        System.out.println();
        sc.close();
    }
}
