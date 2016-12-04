package clase_7_2017;

import java.util.Scanner;


public class SumaCadenaDeNumeros {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de números que quieras sumar");
        String numeros = sc.nextLine();
        String arr[] = numeros.split(" ");
        int suma = 0;
        for (String elemento : arr) {
            suma = Integer.parseInt(elemento) + suma;
        }
        System.out.println("La suma de todos los números es " + suma);

    }
}


