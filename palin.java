import java.io.*;
import java.util.*;
class palin
{
public static void main(String args[])
{int a=0;
String max=new String();
Scanner s=new Scanner(System.in);
String ss=s.next();
String tt[]=new String[10];
char c[]=new char[ss.length()];
int l=ss.length();
for(int k=0;k<l;k++)
{
c[k]=ss.charAt(k);
}
for(int i=0;i<l;i++)
{
for(int j=l-1;j>=0;j--)
{
if(i<j)
{
if(c[i]==c[j])
{
String sss=ss.substring(i,j+1);
StringBuffer sst=new StringBuffer(sss);
sst.reverse();
 String stt=new String(sst);
if(sss.equals(stt))
{
String ttt=new String(sst);
tt[a++]=ttt;
max=tt[0];
}
}
}}}
for(int i=1;i<a;i++)
{int len=max.length();
int lenn=tt[i].length();
if(len<lenn)
max=tt[i];
}
System.out.print(max);
}}
