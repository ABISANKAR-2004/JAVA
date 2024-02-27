import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        // Variables
        int a=0, n;

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        while(n>0){
          n=n/10;
          a++;
        }
        

        // Output
        System.out.println("Number of digits in the given number: " +a);
    }}
