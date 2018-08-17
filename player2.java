import java.util.*;
class code
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=1;
        if(a<=20)
        {
            for(int i=1;i<=a;i++)
            {
                f=f*i;
            }
            System.out.print(f);
        }
    }
}
