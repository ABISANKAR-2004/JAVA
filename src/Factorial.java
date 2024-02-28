import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to know the factorial value:");
        n= in.nextInt();
        int m=n;
        int f=1;
        for(int i=1;i<=m;i++)
        {
            f=f*i;

        }
        System.out.println("The factorial value of "+n+" is:"+f);

    }
}
