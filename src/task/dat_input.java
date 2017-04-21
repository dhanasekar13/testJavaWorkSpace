package task;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;


public class dat_input {

	public static void main(String[] args)throws java.lang.Exception
	{
	
		// TODO Auto-generated method stub
		DataInputStream reader = new DataInputStream(System.in);
		BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a details: ");
		System.out.println("assigner: ");
		String assigner= reader1.readLine();
		System.out.println("asignee: ");
		String assignee= reader1.readLine();
		System.out.println("task description: ");
		String task= reader1.readLine();
		System.out.println("dead line: ");
		int dl= reader.readInt();

		System.out.println("assigner: "+assigner);

		System.out.println("assignee: "+assignee);

		System.out.println("task details: "+task);

		System.out.println("dead line: "+dl);
	}
}
