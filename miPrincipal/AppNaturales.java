package miPrincipal;
import java.util.Scanner;
public class AppNaturales {
 
    public static void menu() {
    System.out.println("_______________________");
    System.out.println("   Numeros Naturales   ");
    System.out.println("_______________________");
    Scanner sc=new Scanner(System.in);
    System.out.println("Proporciona un número:");
    int n=sc.nextInt();
    System.out.println("Versión Iterativa");
    muestraNaturalesIte(n);
    System.out.println("Versión Recursiva");
    muestraNaturalesRec(n);

    }
    public static void muestraNaturalesIte(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static void muestraNaturalesRec(int n){
        if (n>0) {
            muestraNaturalesRec(n-1);
            System.out.println(n);
        }
    }
}