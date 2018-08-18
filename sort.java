import java.util.*;
import java.util.Arrays;
class Sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int c=0,i,temp=0;
        for(i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        for( i=0;i<=a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
            if((n>=1)||(n<=100000))
            {
                Arrays.sort(a);
                if((a[i]==a[j])&&(i!=j))
                {
                  System.out.print(a[i]+" ");
                }
            }
    
                else
                {
                    System.out.print("unique");
                }
            }
        }
    }
}
