package task;

interface sd
{
	
}
 public class clone2 implements sd,Cloneable
 {
int a;
int b;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		clone2 i=new clone2();
		i.a=2;i.b=4;
		System.out.println(i.a+" "+i.b);
		i.a=4;i.b=5;
		System.out.println(i.a+" "+i.b);
		clone2 j=(clone2)i.clone();
		System.out.println(j.a+" "+j.b);
		i.a=0;i.b=0;
		System.out.println(i.a+" "+i.b);
		System.out.println(j.a+" "+j.b);

	}

}

