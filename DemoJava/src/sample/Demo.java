package sample;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Demo extends ArrayList<Student> {

	public void insertNew() {
		String newId, newName;
		int newAge;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Input ID: ");
		newId = sc.nextLine();
		System.out.print("Input Name: ");
		newName = sc.nextLine();
		System.out.print("Input Age: ");
		newAge = Integer.parseInt(sc.nextLine());

		this.add(new Student(newId, newName, newAge));
	}

	public void printAll() {
		int s = this.size();
		System.out.format("%-10s %-10s %-10s\n", "ID","Name","Age");
		for (int i = 0; i < s; i++) {
			this.get(i).ininin();
		}
	}
}
