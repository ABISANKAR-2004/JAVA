class Reverse_no
{
    public static void main(String args[])
    {
        int d1,d2,d3,temp=0,result=0;
        for(int i=100;i<1000;i++)
        {
            temp=i;
            d3=temp%10;
            temp=temp/10;
            d2=temp%10;
            temp=temp/10;
            d1=temp%10;
            result=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);

            if(i==result)
                System.out.println("Amstrong number:"+i);
        }
    }

}