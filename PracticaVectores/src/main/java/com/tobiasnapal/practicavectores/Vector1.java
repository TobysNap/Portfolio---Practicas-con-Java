/**
 *
 * @author Tobias Napal
 */
import java.util.Scanner;
public class Vector1 {
    public static void main(String[] args) {
    int vector[] = new int[10];
    Scanner teclado = new Scanner (System.in);
    for (int i = 0; i<vector.length; i++){
        System.out.println("Ingrese un número entero entre 1 y 100 para la posición " + i);
        int tecla = teclado.nextInt();
        vector[i] = tecla;
        }
    }
}
