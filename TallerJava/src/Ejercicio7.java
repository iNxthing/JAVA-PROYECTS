import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el salario inicial del profesor: $");
        double salario = sc.nextDouble();
        System.out.print("Ingrese la cantidad de años (N): ");
        int n = sc.nextInt();

        double totalRecibido = 0;

        System.out.println("\n--- Salario por año ---");
        for (int i = 1; i <= n; i++) {
            salario = salario * 1.15;
            totalRecibido += salario;
            System.out.printf("Año %d: $%.2f%n", i, salario);
        }

        System.out.printf("\nSalario al cabo de %d años: $%.2f%n", n, salario);
        System.out.printf("Total recibido en %d años:  $%.2f%n", n, totalRecibido);
    }
}
