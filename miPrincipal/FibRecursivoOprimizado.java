package miPrincipal;
import java.util.Hashtable;
import java.util.Scanner;
public class FibRecursivoOprimizado {

    public static void menu() {
        //Iniciar tabla
        Hashtable<Integer,Double>t=new Hashtable<Integer,Double>();
        t.put(1, 1d);
        t.put(2, 1d);
        //Solicitar ingresar el valor de n.
        Scanner sc=new Scanner(System.in);
        System.out.print("¿Cántos terminos quiere ver");
        int n=new Scanner.nextInt();
        for (int i = 1; i < n; i++) {
            double f=AppFibonacci.fibonacciRecOptimizado(i, t);
            System.out.println("fib("+i+")= "+f);
        }
    }
}