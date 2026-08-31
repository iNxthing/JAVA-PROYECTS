import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pares = 0, impares = 0, mayor = 0, cantidad = 0;
        double suma = 0;

        System.out.println("Ingrese números positivos (0 o negativo para terminar):");

        while (true) {
            System.out.print("Número: ");
            int num = sc.nextInt();

            if (num <= 0) break;

            if (num % 2 == 0) pares++;
            else impares++;

            if (num > mayor) mayor = num;

            suma += num;
            cantidad++;
        }

        if (cantidad == 0) {
            System.out.println("No ingresó ningún número.");
        } else {
            System.out.println("\n--- Resultados ---");
            System.out.println("Pares:    " + pares);
            System.out.println("Impares:  " + impares);
            System.out.println("Promedio: " + (suma / cantidad));
            System.out.println("Mayor:    " + mayor);
        }
    }
}
