package task;
import java.util.Scanner;;

public class info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner reader = new Scanner(System.in); 	
		System.out.println("Enter a details: ");
		System.out.println("assigner: ");
		String assigner= reader.nextLine();
		System.out.println("asignee: ");
		String assignee= reader.nextLine();
		System.out.println("task description: ");
		String task= reader.nextLine();
		System.out.println("dead line: ");
		int dl= reader.nextInt();

		System.out.println("assigner: "+assigner);

		System.out.println("assignee: "+assignee);

		System.out.println("task details: "+task);

		System.out.println("dead line: "+dl);
	}

}

