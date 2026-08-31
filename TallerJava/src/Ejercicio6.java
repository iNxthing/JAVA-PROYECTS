public class Ejercicio6 {
    public static void main(String[] args) {
        int pedro = 90;
        int pablo = 170;

        while (pedro != pablo) {
            pedro++;  // Pedro avanza hacia Pablo
            pablo--;  // Pablo avanza hacia Pedro
        }

        System.out.println("Se encuentran en el metro: " + pedro);
    }
}
