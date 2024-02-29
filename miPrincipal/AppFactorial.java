package miPrincipal;
public class AppFactorial {
   //Iterativa
    public static void menu(){
   System.out.println("_______________________");
   System.out.println("       FACTORIAL       ");
   System.out.println("_______________________");
   System.out.println("Versión Iterativa");
   int n=5;
   System.out.println("Factorial de "+n+"!="+Factorial_ite(n));
   System.out.println("Versión Recursiva");
   System.out.println("Factorial de "+n+"!="+Factorial_rec(n));
   }
   public static long Factorial_ite(int n){
      long fact=1;
      for(int i=n;i>0;i--){
         fact=fact*i;
      }
      return fact;
   }
   public static long Factorial_rec(int n){
      if(n==0)
      return 1;
      else
      return Factorial_rec(n-1)*n;
   }
}