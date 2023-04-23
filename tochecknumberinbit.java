import java.util.*;

public class tochecknumberinbit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = sc.nextInt();
        int bitMask = 1<<position;

        if((bitMask & n) == 0)
        {
            System.out.println("bit was zero");
        }
        else
        {
            System.out.println("bit was one");
        }
    }
    
}
