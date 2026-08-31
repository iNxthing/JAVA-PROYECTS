import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el monto del seguro: $");
        double monto = sc.nextDouble();

        double cuota;
        if (monto < 500000) {
            cuota = monto * 0.03;
            System.out.println("Porcentaje aplicado: 3%");
        } else {
            cuota = monto * 0.02;
            System.out.println("Porcentaje aplicado: 2%");
        }

        System.out.println("Cuota a pagar: $" + cuota);
    }
}
