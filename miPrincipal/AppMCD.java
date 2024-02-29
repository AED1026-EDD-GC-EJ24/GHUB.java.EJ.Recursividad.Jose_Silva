package miPrincipal;
public class AppMCD {

    public static void menu(){
        System.out.println("Máximo Común Divisor");
        
    }
    public static int mcd(int m,int n){
        if (n<=m&&m%n==0) {
            return n;
        } else if(m<n){
            return (mcd(m, n));
        } else 
        {return mcd(n, m%n);}
        
        

    }
}