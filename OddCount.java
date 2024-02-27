import java.util.Scanner;

public class OddCount{
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
       int n;
        System.out.println("Enter a number: ");
        n = scanner.nextInt();
         int a[]=new int[n];
        for (int i=0;i<=a.length-1;i++){
            a[i]=scanner.nextInt();
        }
        for (int i=0;i<=a.length-1;i++){
            System.out.println(a[i]);
        }
}}
