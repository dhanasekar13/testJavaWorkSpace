package task;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class strin_buffer {

	public static void main(String[] args)throws java.lang.Exception
	{
	
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter a details: ");
		System.out.println("assigner: ");
		String assigner= reader.readLine();
		System.out.println("asignee: ");
		String assignee= reader.readLine();
		System.out.println("task description: ");
		String task= reader.readLine();
		System.out.println("dead line: ");
		int dl= Integer.parseInt(reader.readLine());

		System.out.println("assigner: "+assigner);

		System.out.println("assignee: "+assignee);

		System.out.println("task details: "+task);

		System.out.println("dead line: "+dl);
	}
}
