package practico1;

import java.util.Scanner;

public class ej1 {
    private static int Factorial (int num){
        if (num==1) {
            return 1;
        } else {
            return num * Factorial(num-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Ingrese el numero que desea calcular el factorial");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(Factorial(num));   
    }
}
