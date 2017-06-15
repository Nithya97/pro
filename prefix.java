import java.io.*;
import java.util.*;
class prefix
{
    public static void main(String args[])
    {int min,count=0;
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        String pre=new String();
        String s1[]=ss.split(" ");
        String s2=new String();
          min=s1[0].length();
          pre=s1[0];
          //System.out.println("**"+s1[0]);
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].length()<min)
        {
        min=s1[i].length();
        pre=s1[i];
        //System.out.println("*"+pre);
        }
    
        }//System.out.println("*");
        //System.out.print(pre);
          for(int j=0;j<s1.length;j++)
          {
              if(s1[j].startsWith(pre))
              {
                  count=1;
              }
              else
              {s2=pre.substring(0,min-1);
              pre=s2;}
          }
              
              if(count==1){
                 System.out.print(pre);}
                 else
                 {
                 System.out.print("no common prefix");}
    }
}



