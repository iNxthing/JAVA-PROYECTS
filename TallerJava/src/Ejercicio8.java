public class Ejercicio8 {
    public static void main(String[] args) {
        double pago = 10;
        double total = 0;

        System.out.println("--- Pagos mensuales ---");
        for (int mes = 1; mes <= 36; mes++) {
            total += pago;
            System.out.printf("Mes %2d: $%.2f%n", mes, pago);
            pago *= 2;
        }

        System.out.printf("\nTotal pagado en 36 meses: $%.2f%n", total);
    }
}
