    package practico1;

import java.util.Scanner;

public class Recursividad {
    public int Factorial (int num){
        if (num==1) {
            return 1;
        } else {
            return num * Factorial(num-1);
        }
    }
    
    public int Suma (int num) throws Excepciones{
        if (num==1) {
            return 1;
        } else if (num>1) {
            return num + Suma(num-1);
        } else {
            throw new Excepciones ("El numero ingresado no es valido");
        }
    }
    
    public int pot (int num, int exp) throws Excepciones{
        if (exp==0) {
            return 1;
        } else if (exp>0) {
            return num * pot(num,exp-1);
        } else {
            throw new Excepciones ("El numero ingresado no es valido");
        }
    }
    
    public int conteoReg (int num) throws Excepciones{
        if (num==1) {
            return 1;
        } else if (num>1) {
            System.out.print(num+", ");
            return conteoReg(num-1);
        } else {
            throw new Excepciones ("El numero ingresado no es valido");
        }
    }
    
    public int multiplicacion (int num1, int num2) throws Excepciones{
        if (num2==0) {
            return 0;
        } else if (num2>0) {
            return num1 + multiplicacion(num1,num2-1);
        } else {
            throw new Excepciones ("El numero ingresado no es valido");
        }
    }
    
    public int arregloReg (int[] arreglo, int pos) throws Excepciones{
        if (pos==-1) {
            return 0;
        } else if (pos>-1) {
            System.out.print(arreglo[pos]+", ");
            return arregloReg(arreglo, pos-1);
        } else {
            throw new Excepciones ("El numero ingresado no es valido");
        }
    }
    
    public int binario (int num, String bin) throws Excepciones{
        if (num==1) {
            bin=1+bin;
            System.out.println(bin);
            return 1;
        } else if (num>1) {
            bin=num%2+bin+"";
            return binario(num/2, bin);
        } else {
            throw new Excepciones ("El numero ingresado no es valido");
        }
    }
}