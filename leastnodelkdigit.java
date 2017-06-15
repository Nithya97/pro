import java.io.*;
import java.util.*;
class leastnodelkdigit
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        String s1[]=ss.split(" ");
        int n=s.nextInt();
       int a[]=new int[s1.length];
        for(int i=0;i<s1.length;i++)
        {a[i]=Integer.parseInt(s1[i]);
        }
        if(a.length>=n)
        {
            Arrays.sort(a);
        for(int j=0;j<a.length-n;j++)
        {
            System.out.print(a[j]);
        }
    }}
}
