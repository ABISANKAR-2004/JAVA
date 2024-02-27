import java.util.Scanner;

public class Smallest{
    public static void main(String[] args) {
        
        int a, b,c;

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = scanner.nextInt();
        System.out.println("Enter a number: ");
       
        b= scanner.nextInt();
        System.out.println("Enter a number: ");
        c= scanner.nextInt();
        if(a<=b && a<=c)
          System.out.println("The smallest number is a:"+a);
        else if(b<=a && b<=c)
            System.out.println("The smallest number is b:"+b);
        else
            System.out.println("The smallest number is c:"+c);
          }}
