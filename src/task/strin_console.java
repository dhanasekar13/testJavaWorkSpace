package task;
import java.io.Console;
public class strin_console {

	public static void main(String[] args)throws java.lang.Exception
	{
	
		Console reader = System.console();
		Console reader1 = System.console();
		System.out.println("Enter a details: ");
		System.out.println("assigner: ");
		String assigner= reader1.readLine();
		System.out.println("asignee: ");
		String assignee= reader1.readLine();
		System.out.println("task description: ");
		String task= reader1.readLine();
		System.out.println("dead line: ");
		int dl= Integer.parseInt(reader.readLine());

		System.out.println("assigner: "+assigner);

		System.out.println("assignee: "+assignee);

		System.out.println("task details: "+task);

		System.out.println("dead line: "+dl);
	}
}
