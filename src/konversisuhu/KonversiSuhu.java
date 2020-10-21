
package konversisuhu;

import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {
    
        double c,r,f,k; //variabel
   Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan = ");
          c = input.nextInt(); //input suhu Celcius
          r = c*4/5; // rumus reamur
          f = (c*9/5)+32; //rumus farenfait
          k = c+273.15; //rumus kelfin
        System.out.println("  ");
        System.out.println("Celsius = " +c);   
        System.out.println("Reamur = "+r);     
        System.out.println("Fahrenheit = "+f); 
        System.out.println("Kelvin = "+k);     
    }
}
    