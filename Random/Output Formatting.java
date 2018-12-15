import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-14s %03d\n",s1,x);
                //%-14s left pads s1 and total space in line alloted to s1 is 14
                //%03d gives total space of 3 to x and pads x with 0 on the left if x is less than 3 digits
                
            }
            sc.close();
            System.out.println("================================");

    }
}



