import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int inicio = (i % 2 == 0) ? 2 : 1;
            for (int j = 0; j < i; j++) {
                System.out.print(inicio + j * 2);
                if (j < i - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
