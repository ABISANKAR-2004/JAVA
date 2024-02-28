import java.lang.*;
import java.util.*;



class Type_casting
{
    public static void main(String args[])
    {
           Scanner d=new Scanner(System.in);
           int a,b;
           String name;
           System.out.println("a value:");
           a= d.nextInt();
           System.out.println("b value:");
           b= d.nextInt();
           System.out.println("name:");
           name= d.next();
           System.out.println("addition:"+(a+b));
        System.out.println("sub:"+(a-b));
        System.out.println("multiplication:"+(a*b));
        System.out.println("division:"+(a/b));
        System.out.println("name:"+name);
    }
}