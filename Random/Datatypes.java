import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");
                /* 
                 * 9223372036854775808L the L has to be added as java supports literal value only from -2147483648 to 2147483647
                 * Here by integer we mean byte, short, int, and long. So when a literal (the number value or constant) 
                 * is being assigned to any of the integer datatypes, the max value that could be used is between the above specified range
                 * Any value above that has to accompanied with an L
                 * Note that if written in the form of: if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                 * we dont require an L
                 */
                           
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}


