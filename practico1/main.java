package practico1;

import java.util.Scanner;

public class main {
    public static void main(String args[]) throws Excepciones {
        Recursividad r = new Recursividad();
        Scanner scn = new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("Ingrese la opcion que desea realizar");
            opcion = scn.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.println("Ingrese el numero que desea calcular el factorial");
                    int num = scn.nextInt();
                    System.out.println(r.Factorial(num)); 
                }
                case 2 -> {
                    System.out.println("Ingrese el numero que desea calcular la suma de sus anteriores");
                    int num = scn.nextInt();
                    System.out.println(r.Suma(num));   
                }
                
                case 3 -> {
                    System.out.println("Ingrese el numero que desea calcular la potencia");
                    int num = scn.nextInt();
                    System.out.println("Ingrese el exponente al que desea elevar el numero");
                    int exp = scn.nextInt();
                    System.out.println(r.pot(num, exp));   
                }
                
                case 4 -> {
                    System.out.println("Ingrese el numero que desea escribir el conteo regresivo");
                    int num = scn.nextInt();
                    System.out.println(r.conteoReg(num));   
                }
                
                case 5 -> {
                    System.out.println("Ingrese el multiplicando");
                    int num1 = scn.nextInt();
                    System.out.println("Ingrese el multiplicador");
                    int num2 = scn.nextInt();
                    System.out.println(r.multiplicacion(num1, num2));   
                }
                
                case 6 -> {
                    System.out.println("El arreglo es:");
                    var arreglo = new int[5];
                    for (int i = 0; i < 5; i++) {
                        arreglo[i]=i+15;
                        System.out.println(arreglo[i]);
                    }
                    System.out.println("Arreglo invertido:");
                    r.arregloReg(arreglo, (arreglo.length -1));   
                }
                
                case 7 -> {
                    System.out.println("Ingrese el numero que desea escribir en binario");
                    int num = scn.nextInt();
                    String bin="";
                    r.binario(num, bin);   
                }
                
                default -> {
                    System.out.println("");
                }
}
        } while (opcion!=0);
    }
}
