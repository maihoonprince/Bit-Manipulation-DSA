// clear the Given bit:-

import java.util.*;

public class clearBit 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        
        int bitMask = 1<<pos;
        int bit = ~ bitMask;

        int newNumber = bit & n;

        System.out.println(newNumber);
    }
    
}
