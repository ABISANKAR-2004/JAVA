import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
       String n;
       String r="";
        System.out.println("Enter a string: ");
        n = scanner.nextLine();
        for (int i=n.length()-1;i>=0;i--){
           r+=n.charAt(i);
        }
        if(n.equalsIgnoreCase(r))
            System.out.println("the given string is palindrome:"+n);
        else
            System.out.println("the given string is not palindrome:"+n);
}}
