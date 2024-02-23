package miPrincipal;
public class AppLadrillos {

    public static void menu(){
        /*(Solución iterativa)
        for(int i=0;i<10;i++){
           //System.out.println("Ilera de ladrillos"); 
        }
        */
        //(Solución recursiva)
        drawWall();
    }
    public static void drawWall(){
        drawWall();
        System.out.println("Ladrillos");
    }
    public static void drawLine(){
       
    }
}