package miPrincipal;

import java.util.Hashtable;
import java.util.Scanner;

public class AppFibonacci {
    public static void menu() {
        System.out.println();
        System.out.println("______Serie de Fibonacci______");
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese un valor: ");
        int n=sc.nextInt();
        double Cont=0;
        //Invocación de metodo iterativo
        double f =fibonacciIte(n);

    }
    static double fibonacciIte(int n){
        double f=1,r1=1,r2=1;
        for (int i = 3; i < n; i++) {
            f=r1+r2;
            r1=r2;
            r2=f;
        }
        return f;
    }
    static double fibonacciRec(int n){
        if (n<=2) {
            f=1;
        } else {
            f=fibonacciRec(n-1)+fibonacciRec(n-2);
        }
        return f;
    }
    static long setContador(double x){
        return cont;}
    static double fibonacciRecOptimizado(int x,Hashtable<Integer,Double>t){
        //Primero verificamos si el resultado está en la tabla.
        Double d=t.get(x);
        //Si no estaba entonces calculamos y lo ingresamos a la tabla.
        if (d==null) {
            d=fibonacciRecOptimizado(x-1,t)+fibonacciRecOptimizado(x-2, t);
            t.put(x, d);
        }
        //Retorna valor
        return d;
    }
}