import java.lang.*;
import java.util.Scanner;
public class Dup{
    public static void main(String args[]){
        Scanner nu=new Scanner(System.in);
        int n=nu.nextInt();
        int arr[]=new int[n];
        int k=nu.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++)
        arr[i]=nu.nextInt();
        for(int i=0;i<k;i++){
            
            for(int j=i+1;j<k;j++){
                if(arr[i]==arr[j])
                    count++;
            }
            
        }
        if(count==1)
            System.out.println("Yes");
        else
        System.out.println("No");
        
    }
}