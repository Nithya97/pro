
import java.io.*;
import java.util.*;
class rupe
{
    public static void main(String args[])
    {int sum=0;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=s.nextInt();
        int b[]=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=s.nextInt();
        }
        Arrays.sort(b);
       int j=a-1;
            while(c!=0)
            {
                sum=sum+(c/b[j]);
                c=c%b[j];
                j--;
            
            }
            if(c==0){
            System.out.println(sum);
        }
        
    }
}
