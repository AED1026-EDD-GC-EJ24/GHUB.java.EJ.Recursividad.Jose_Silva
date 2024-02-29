package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) throws Exception {
        Scanner consola = new Scanner(System.in);
        int opc =0;
        do{
            System.out.println("*************************");
            System.out.println("       RECURIVIDAD       ");
            System.out.println("*************************");
            System.out.println("1) Imprimir Ladrillos");
            System.out.println("2) Factorial");
            System.out.println("3) Números naturales");
            System.out.println("4) Suma Dígitos");
            System.out.println("5) Recursivcidad Indirecta");
            System.out.println("6) Máximo Común Divisor");
            System.out.println("7) Busqueda Binaria");
            System.out.println("8) Ordenamiento Selección");
            System.out.println("9) Torres de Hanoi");
            System.out.println("10) Serie de Fibonacci");
            System.out.println("11) Performance Serie de Fibonacci");
            System.out.println("12) Ordenación por Mezclas");
            System.out.println("");
            System.out.println("0) SALIR");
            System.out.print("Selecciona opción:");
            opc=consola.nextInt();

            switch (opc){
            case 1:
               AppLadrillos.menu();
               break;
            case 2:
               AppFactorial.menu();
               break;
            case 3:
               AppNaturales.menu();
               break;
            case 4:
               AppSumaDigitos.menu();
               break;
            case 0:
               System.out.println("ADIOS!");
               consola.close();
               break;
               

            default:
               System.out.println("Valor incorrecto, intente de nuevo!");

        }
       
    }while (opc != 0);
		
    }
}