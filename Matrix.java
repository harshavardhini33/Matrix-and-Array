import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n= sc.nextInt();
        int [][] arr=new int[n][n];
        int [][] arr1=new int[n][n];
        int [][] sum=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum[i][j]=+arr[i][j]+arr1[i][j];
            }
        }
        System.out.println("Sum of the Martix: " );
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }




    }
}