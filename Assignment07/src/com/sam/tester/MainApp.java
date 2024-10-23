package com.sam.tester;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.sam.entity.Student;

class StudentCityComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getCity().compareTo(o2.getCity());
	}
}

class StudentMarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return -Double.compare(o1.getMarks(), o2.getMarks());
	}

}

class StudentNameComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class MainApp {

	public static int menuChoice(Scanner sc) {
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("\n****Menu****");
		System.out.println("0. Exit");
		System.out.println("1. Sorted on their city (asc)");
		System.out.println("2. Sorted on their on marks (desc)" + "");
		System.out.println("3. Sorted on their on name (asc)");
		System.out.println("4. Sorted on the rollno");
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		System.out.print("\nEnter your choice: ");
		return sc.nextInt();
	}

	public static void displayAllStudent(Student[] arr) {
		for (Student student : arr)
			System.out.println(student);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[5];

		arr[0] = new Student(3, "Suresh", "Pune", 88.78);
		arr[1] = new Student(1, "Anil", "Akola", 48.57);
		arr[2] = new Student(5, "Mukesh", "Karad", 73.91);
		arr[3] = new Student(4, "Ramesh", "Mumbai", 57.84);
		arr[4] = new Student(2, "Sham", "Satara", 91.19);
		int choice;

		while ((choice = menuChoice(sc)) != 0) {
			switch (choice) {
			case 1: {
				System.out.println("1. Sorted on their city (asc)");
				System.out.println("\t\tBefore Sorting -->\n");
				displayAllStudent(arr);
				System.out.println("\n\t\tAfter Sorting -->\n");
				Arrays.sort(arr, new StudentCityComparator());
				displayAllStudent(arr);
			}
				break;

			case 2: {
				System.out.println("2. Sorted on their on marks (desc)\r\n" + "");
				System.out.println("\t\tBefore Sorting -->\n");
				displayAllStudent(arr);
				System.out.println("\n\t\tAfter Sorting -->\n");
				Arrays.sort(arr, new StudentMarksComparator());
				displayAllStudent(arr);
			}
				break;

			case 3: {
				System.out.println("3. Sorted on their on name (asc)");

				System.out.println("\t\tBefore Sorting -->\n");
				displayAllStudent(arr);
				System.out.println("\n\t\tAfter Sorting -->\n");
				Arrays.sort(arr, new StudentNameComparator());
				displayAllStudent(arr);
			}
				break;

			case 4: {
				System.out.println("4. Sorted on the rollno");
				displayAllStudent(arr);
				System.out.println("\n\t\tAfter Sorting -->\n");
				Arrays.sort(arr);
				displayAllStudent(arr);
			}
				break;

			default:
				System.out.println("Invalid Choice !!!!");
				break;

			} // switch
		} // while
	}

}
