/*   get the string info from the user
        find how many repeatation lettr are present
 
  
 */
package task;
import java.util.ArrayList;
import java.util.Scanner;

public class duplicate1 {

	public static void main(String[] args) throws Exception{
		
		Scanner su=new Scanner(System.in);
		System.out.println("enter the string ");
		String r=su.nextLine();
		int hi=1;
		int ci=r.length();
		char[] d=new char[ci];
		
		ArrayList<Character> er=new ArrayList<Character>(ci);
		ArrayList<Character> eri=new ArrayList<Character>(ci);
	
		 for (int fi=0;fi<d.length;fi++)  
		{
			d[fi]=r.charAt(fi);
			er.add(r.charAt(fi)); 
		}
		 for(int li=0;li<er.size();li++)
		 {
			 eri.clear();
			 eri.add(er.get(0));
			 for(int fj=1;fj<er.size();fj++)
			 {
				 if(er.get(0)==er.get(fj))
				 {
					 hi++;
				 }
			 }
			 System.out.println("string element "+er.get(0)+"  has "+hi+"  of repeating element  ");
			 hi=1;
			 er.removeAll(eri);	
			 
		 }
		hi=0;
		eri.clear();
		 }
		}
	
	  	

