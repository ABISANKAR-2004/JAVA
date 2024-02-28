import java.lang.*;
import java.util.*;

class dis
{
    void add()
    {
        int a=20,b=45,c;
        c=a+b;
        System.out.println(c);
    }


}

class Unary
{
    int s=15;
    public static void main(String args[])
    {
        float e;
        Scanner in=new Scanner(System.in);
        System.out.println("e value:");
        e=in.nextFloat();
        Unary nu=new Unary();
        System.out.println(nu.s);
        dis un=new dis();
        un.add();

    }
}