
import java.util.Scanner;

class Arr
{
    public static void main(String args)
    {
        int a[]=new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i< a.length;i++)
        {
            System.out.println("Enter the array value:");
            a[i]=in.nextInt();
        }
        for(int i=0;i< a.length;i++)
        {
            System.out.println("value of array:"+a[i]);

        }
    }
}
