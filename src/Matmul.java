import java.util.Scanner;
public class Matmul{
    
    public static void main(String[] args) {
        int r1,c1,r2,c2;
        Scanner nu=new Scanner(System.in);
        
        System.out.println(" Enter a row  and column for first matrix");
        r1=nu.nextInt();
        c1=nu.nextInt();
        System.out.println(" Enter a row  and column for second matrix");
        r2=nu.nextInt();
        c2=nu.nextInt();
        int arr[][]=new int[r1][c1];
        int arr1[][]=new int[r2][c2];
        int mul[][]=new int[r1][c2];
        if(c1==r2){
            System.out.println("Ente rthe value of second matrix");
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    arr[i][j]=nu.nextInt();
                }
            }
            System.out.println("Ente rthe value of second matrix");
            for(int i=0;i<r2;i++){
                for(int j=0;j<c2;j++){
                    arr1[i][j]=nu.nextInt();
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    for(int k=0;k<c2;k++){
                        mul[i][j]+=arr[i][k]*arr1[k][j];
                    }
                }
            }
            for(int i=0;i<r1;i++){
                for(int j=0;j<c2;j++){
                    System.out.print(mul[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}