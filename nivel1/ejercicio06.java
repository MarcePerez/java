import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
    
        int x = scan.nextInt();
        int y = scan.nextInt();
    
        int resultado = potencia(x, y);
        System.out.println("El resultado de " + x + " elevado " + y + " : " + resultado);
        }
    
        public static int potencia(int x, int y) {
        int total = 1;
        for(int i = 1; i <= y; i++) {
            total = total * x;
        }
        return total;
    }
}
