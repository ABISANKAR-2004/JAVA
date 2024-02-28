/*public class Exam
{
    public static void main(String args[])
    {
        int a=10,b=20,res;
        res=(a>b)? (a+b):(a-b);
        System.out.println(res);


    }
}*/
import java.util.*;
class Area
{
    float length,breadth,area;
    void setvalues(float len,float bre)
    {
        length=len;
        breadth=bre;

        area=length*breadth;
    }
    float getarea()
    {
        return area;
    }
    public static void main(String args[])
    {
        Scanner nu=new Scanner(System.in);
        float l,b;
        System.out.println("Enter the length:");
        l=nu.nextFloat();
        System.out.println("Enter the breadth:");
        b=nu.nextFloat();
        Area a=new Area();
        a.setvalues(l,b);

        System.out.println("Area of the rectangle:"+a.getarea());
    }
}