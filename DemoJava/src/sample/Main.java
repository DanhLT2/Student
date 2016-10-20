package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Demo m = new Demo();
		int choice;
		
		do {
			System.out.print("Choice Menu: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				m.insertNew();
				break;
			case 2:
				m.printAll();
				break;
			default:
				System.out.println("GoodBye");
			}
		} while (choice < 3);

	}

}
