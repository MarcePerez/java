import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner (System.in);
        System.out.println("Ingrese dos numeros");
        int a = numeros.nextInt();
        int b = numeros.nextInt();

        Object suma;
        for (int i = 1  ; i <= b; i++){
            System.out.println(i);
            suma = a + b;
        }
        System.out.println("es: " + (numeros));
    }
    }