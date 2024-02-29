package miPrincipal;
public class AppLadrillos {

    public static void menu(){
        /*(Solución iterativa)
        for(int i=0;i<10;i++){
           //System.out.println("Ilera de ladrillos"); 
        }
        */
        //(Solución recursiva)
        int n=10;
        drawWall(n);
    }
    public static void drawWall(int n){
        if(n-1>0)
        drawWall(n-1);
        System.out.println("Ladrillos "+n);
    }
    public static void drawLine(){
        System.out.println("Ladrillos");
    }
}