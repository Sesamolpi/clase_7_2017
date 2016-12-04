package clase_7_2017;

import java.util.Scanner;


public class Capicua {
  
    
    
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        boolean capicua = true;
        System.out.println("Introduce un número");
        String num = Integer.toString(src.nextInt());
        for (int i = 0, j = num.length() - 1; i < num.length() / 2; i++, j--) {
            if (num.charAt(i) != num.charAt(j)) {
                capicua = false;
            }
        }

        if (capicua == true) {
            System.out.println("El número introducido es capicua");
        } else {
            System.out.println("No lo es");
        }
    }
}
