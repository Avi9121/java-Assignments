package com.technoelevte.assignments.studentproject.byneelimsir;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) throws InterruptedException {
		List<Student2> list = new ArrayList<Student2>();
		list.add(new Student2(1, "avinash", 35, 9845261250L, "Male", 22));
		list.add(new Student2(2, "sagar", 55, 6483863643L, "Male", 21));
		list.add(new Student2(3, "azeesha", 75, 9845484544L, "Male", 52));
		list.add(new Student2(4, "sandesh", 86, 8946484577L, "Male", 32));
		list.add(new Student2(5, "gourav", 95, 7404749478L, "Male", 25));

		mainMunu(list);
	}

	private static void mainMunu(List<Student2> list) throws InterruptedException {
		String str = "1.Sort by id\n2.Sort by Name\n3.Sort by Percentage\n4.Sort by Gender\n5.Sort by Age\n";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			Thread.sleep(30);
		}

		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		switch (userInput) {
		case 1:
			Collections.sort(list, Student2.IdCom);
			System.out.println("Sorted by Id");

			for (Student2 student22 : list) {

				System.out.println(student22.getId());
				Thread.sleep(130);
			}
			String str2 = "1.see the whole list which sorted by id\n2.Exit";

			for (int i = 0; i < str2.length(); i++) {
				System.out.print(str2.charAt(i));
				Thread.sleep(30);
			}
			int userInput1 = sc.nextInt();
			if (userInput1 == 1) {
				System.out.println(list);
				System.out.println("Enter 1 for Main Menu");
				int userInput11 = sc.nextInt();
				if (userInput11 == 1) {
					mainMunu(list);
				} else {
					System.out.println("Invalid Input");
				}
			} else if (userInput1 == 2) {
				exit();
			} else {
				System.out.println("Invalid Input");
			}
			break;

		case 2:
			Collections.sort(list, Student2.NameCom);
			for (Student2 student22 : list) {

				System.out.println(student22.getName());
				Thread.sleep(130);
			}
			String str3 = "1.see the whole list which sorted by Name\n2.Exit";

			for (int i = 0; i < str3.length(); i++) {
				System.out.print(str3.charAt(i));
				Thread.sleep(30);
			}

			int userInput2 = sc.nextInt();
			if (userInput2 == 1) {
				System.out.println(list);
				System.out.println("Enter 1 for Main Menu");
				int userInput11 = sc.nextInt();
				if (userInput11 == 1) {
					mainMunu(list);
				} else {
					System.out.println("Invalid Input");
				}
			} else if (userInput2 == 2) {
				exit();
			} else {
				System.out.println("Invalid Input");
			}
			break;
		case 3:
			Collections.sort(list, Student2.perCom);
			for (Student2 student22 : list) {

				System.out.println(student22.getPer());
				Thread.sleep(130);
			}

			String str4 = "1.see the whole list which sorted by Percentage\n2.Exit";

			for (int i = 0; i < str4.length(); i++) {
				System.out.print(str4.charAt(i));
				Thread.sleep(30);
			}
			int userInput3 = sc.nextInt();
			if (userInput3 == 1) {
				System.out.println(list);
				System.out.println("Enter 1 for Main Menu");
				int userInput11 = sc.nextInt();
				if (userInput11 == 1) {
					mainMunu(list);
				} else {
					System.out.println("Invalid Input");
				}
			} else if (userInput3 == 2) {
				exit();
			} else {
				System.out.println("Invalid Input");
			}
			break;
		case 4:
			Collections.sort(list, Student2.NameGen);
			for (Student2 student22 : list) {

				System.out.println(student22.getGender());
				Thread.sleep(130);
			}

			String str5 = "1.see the whole list which sorted by Gender\n2.Exit";

			for (int i = 0; i < str5.length(); i++) {
				System.out.print(str5.charAt(i));
				Thread.sleep(30);
			}
			int userInput4 = sc.nextInt();
			if (userInput4 == 1) {
				System.out.println(list);
				System.out.println("Enter 1 for Main Menu");
				int userInput11 = sc.nextInt();
				if (userInput11 == 1) {
					mainMunu(list);
				} else {
					System.out.println("Invalid Input");
				}
			} else if (userInput4 == 2) {
				exit();
			} else {
				System.out.println("Invalid Input");
			}
			break;
		case 5:
			Collections.sort(list, Student2.ageCom);
			for (Student2 student22 : list) {

				System.out.println(student22.getAge());
				Thread.sleep(130);
			}

			String str6 = "1.see the whole list which sorted by Age\n2.Exit";

			for (int i = 0; i < str6.length(); i++) {
				System.out.print(str6.charAt(i));
				Thread.sleep(30);
			}
			int userInput5 = sc.nextInt();
			if (userInput5 == 1) {
				System.out.println(list);
				System.out.println("Enter 1 for Main Menu");
				int userInput11 = sc.nextInt();
				if (userInput11 == 1) {
					mainMunu(list);
				} else {
					System.out.println("Invalid Input");
				}
			} else if (userInput5 == 2) {
				exit();
			} else {
				System.out.println("Invalid Input");
			}
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + userInput);
		}

	}

	public static void exit() throws InterruptedException {
		String str3 = "Thankyou.......\nI hope you Enjoyed";

		for (int i = 0; i < str3.length(); i++) {
			System.out.print(str3.charAt(i));
			Thread.sleep(30);
		}
	}

}
