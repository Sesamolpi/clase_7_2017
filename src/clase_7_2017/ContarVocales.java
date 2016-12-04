package clase_7_2017;

import java.util.Scanner;

// Realiza un programa que lea una cadena y diga cuántas vocales hay


public class ContarVocales {
     
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
         System.out.println("introduce texto ");
         String str1 = entrada.nextLine().toLowerCase();
         char arr[] = {'a','e','i','o','u'};
         int cont= 0;
         for (int i = 0; i < str1.length();i ++){
             for ( int j = 0 ; j < arr.length ; j++){
                 if ( str1.charAt(i) == arr [j]){
                     cont++ ;
                 }
             }
         }
        System.out.println(" Hay " + cont + " vocales ");
              
    }
}
