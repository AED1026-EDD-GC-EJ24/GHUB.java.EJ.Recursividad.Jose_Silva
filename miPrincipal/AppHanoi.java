package miPrincipal;
public class AppHanoi {

    public static void menu() 
    {
        System.out.println();
        System.out.println("______Torres de Hanoi______");
        System.out.println();
        hanoi('A','B','C',3);    
    }
    public static void hanoi(char varinicial,char varcentral,char varfinal,int n)
    {
        if(n==1)
        {
            System.out.println("Mover disco "+n+" desde varilla "+varinicial+" a varilla "+varfinal);
        } else
        {
            hanoi(varinicial, varcentral, varfinal, n-1);
            System.out.println("Mover disco "+n+" desde varilla"+varinicial+" a varilla "+varfinal);
            hanoi(varinicial, varcentral, varfinal, n-1);
        }
    }
}