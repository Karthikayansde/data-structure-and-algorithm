import java.util.Scanner;

public class FactorFinder {
        public static void main(String[] arg) {
            int a = 0,i=1,b = 0,fa=0, arr[] =new int [100];
            Scanner scan = new Scanner(System.in);
            System.out.print("enter a value : ");
            a = scan.nextInt();
            for(i=1;i<=a;i++)
            {
                if(a%i==0)
                {
                    arr[fa]=i;
                    b++;
                    fa++;
                }
            }
            int c  = b;
            b /= 2;
            for(int j =0;j<b;j++)
            {
                if(c>b)
                {
                    c--;
                    System.out.println(arr[j]+" X "+arr[c]+"  =  "+a);
                }
            }
        }
}