package task;

import java.util.Scanner;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string ");
String r=s.nextLine();
int hi=0;
int ci=r.length();
char[] d=new char[ci];
char[] du=new char[ci];
char[] dq=new char[ci];
int[] f=new int[ci];
int g=0;
    for (int i=0;i<ci;i++)
{
	d[i]=r.charAt(i);
	
}    du[0]=d[0];
for(int j=0;j<ci;j++)
{
if(du[0]==d[j])
{
	hi++;
}
}  System.out.println("string element "+du[0]+"  has "+hi+"  of repeating element  ");
hi=0;int u=0;
for(int i=1;i<ci;i++){
for(int j=0;j<ci;j++)
{
	if(du[i]==d[j])
	{
		f[i]=hi++;
	}
	else
	{
	du[j]=d[j];	
	}

}for(int j=1;j<ci;j++)
{
if(dq[j]!=du[i])
{if(hi!=0)
{
	
System.out.println("string element "+du[i]+"  has "+hi+"  of repeating element  ");
hi=0;
	}}
else
{
dq[j]=d[i];	
}
}
//here repeation has to beee taken care
    	 
}
}
}