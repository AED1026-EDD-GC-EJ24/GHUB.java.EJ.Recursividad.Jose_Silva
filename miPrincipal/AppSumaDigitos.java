package miPrincipal;
import java.util.Scanner;
public class AppSumaDigitos {
public static void menu(){
    System.out.println("_______________________");
    System.out.println("      Suma Dígitos     ");
    System.out.println("_______________________");
    Scanner sc=new Scanner(System.in);
    System.out.println("Proporciona número:");
    int n=sc.nextInt();  
    System.out.println("Versión Iterativa");
    System.out.println("Resultado = "+sumaDigitosite(n));      
}
public static int sumaDigitosite(int n){
    int suma=0;
    while (n>0) {
        suma=suma + n%10;
        n=n/10;
    }
    return (suma+n);
}
public static int sumaDigitosrec(int n){
    if (n<=0) 
        return n;
    else
        return sumaDigitosrec(n/10)+n%10;
    
}  
}