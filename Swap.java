import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        
        int a, n;

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
        System.out.println("Enter a number: ");
        a= scanner.nextInt();
      System.out.println( "before  swapping  a : "+a+"n:"+n);
        a=a+n;
        n=a-n;
        a=a-n;
      System.out.println( "after swapping  a : "+a+"n:"+n);
      

    }} 



