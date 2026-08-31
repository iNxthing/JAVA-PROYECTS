import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();
        System.out.print("Ingrese los días transcurridos: ");
        int dias = sc.nextInt();

        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        int[] meses = {31, bisiesto ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int dia = dias;
        int mes = 0;
        for (int i = 0; i < 12; i++) {
            if (dia <= meses[i]) {
                mes = i + 1;
                break;
            }
            dia -= meses[i];
        }

        System.out.println("Fecha: " + dia + "/" + mes + "/" + anio);
    }
}
