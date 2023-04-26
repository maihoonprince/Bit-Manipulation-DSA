import java.util.*;

public class updateBit 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos  = sc.nextInt();
        int opration = sc.nextInt();
        
        int bitMask = 1<<pos;

        if(opration == 1)
        {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else
        {
            int newBitMask = ~bitMask;
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }
    }
    
}
