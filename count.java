import java.util.*;
class countn{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            c++;
        }
        if(c!=0)
        {
            System.out.print(c);
        }
    }
}
