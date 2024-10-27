package com.sam.tester;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.sam.entities.Project;

public class MainApp {

//	static HashSet<Project> pset = new HashSet<Project>();
	static HashSet<Project> pset = new HashSet<Project>();

	public static int menuChoice(Scanner sc) {
		System.out.println("---------------------------*-Menu-*---------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Add Following Projects in the Set");
		System.out.println("2. Input a Project from user and add in Set");
		System.out.println("3. Display all Projects in Set");
		System.out.println("4. Delete a Project by Id from Set ");
		System.out.println("5. Copy All Projects from Set to ArrayList");
		System.out.println("6. Display all Projects from List");
		System.out.println("7. Sort all Projects in List by cost");
		System.out.println("8. Find project with Max team size using Collections.max() ");
		System.out.println("9. Count all Projects of \"Java\" technology using Stream API ");
		System.out.println("--------------------------------------------------------------");
		System.out.print("Enter your choice: ");
		return sc.nextInt();
	}

	public static void addProject() {
		pset.add(new Project(1, "Train Reservation System", 4, 5000000, "Java"));
		pset.add(new Project(2, "Airline Reservation System", 3, 6000000, ".NET"));
		pset.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
		pset.add(new Project(5, "Outline Book Shop", 2, 3000000, ".NET"));
		pset.add(new Project(3, "Online Jewelry", 4, 4000000, "Java"));
		pset.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
	}

	public static void main(String[] args) {
//		List<Project> projList = new ArrayList<Project>();
		List<Project> projList = loadProject();
		Scanner sc = new Scanner(System.in);
		Project p = null;

		int choice;

		while ((choice = menuChoice(sc)) != 0) {
			switch (choice) {
			case 0: {
				System.out.println("Exit");
			}
				break;

			case 1: {
				addProject();
				System.out.println("1. Add Following Projects in the Set");

			}
				break;

			case 2: {
				System.out.println("2. Input a Project from user and add in Set");
				p = new Project();
				p.accept(sc);
				pset.add(p);
			}
				break;

			case 3: {

				System.out.println("3. Display all Projects in Set");
				pset.forEach(System.out::println);
			}
				break;

			case 4: {
				System.out.println("4. Delete a Project by Id from Set ");
				System.out.println("Enter the id you want to delete: ");
				System.out.println("Project delete: " + projList.remove(new Project(sc.nextInt())));
			}
				break;

			case 5: {
				System.out.println("5. Copy All Projects from Set to ArrayList");
				projList.addAll(pset);
			}
				break;

			case 6: {
				System.out.println("6. Display all Projects from List");
				projList.forEach(System.out::println);
			}
				break;

			case 7: {
				System.out.println("7. Sort all Projects in List by cost");
				projList.stream().sorted((x, y) -> -Double.compare(x.projectCost, y.projectCost))
						.forEach(System.out::println);
			}
				break;

			case 8: {
				System.out.println("8. Find project with Max team size using Collections.max() ");
				System.out.println(
						"Max team size: " + Collections.max(projList, (x, y) -> x.getTeamSize() - y.getTeamSize()));
			}
				break;

			case 9: {
				System.out.println("9. Count all Projects of \"Java\" technology using Stream API ");
				long count = projList.stream().filter(s -> s.getTechnology().contains("Java")).count();
				System.out.println("Count all projects of Java: " + count);
			}
				break;

			default:
				System.out.println("Invalid Choice !!!!");
				break;
			} // switch
		} // while

		saveProject(projList);

	}

	private static void saveProject(List<Project> p) {
		try (FileOutputStream fos = new FileOutputStream("Project1.db")) {
			try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
					oos.writeObject(p);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static List<Project> loadProject() {
		try (FileInputStream fis = new FileInputStream("Project1.db")) {
			try (BufferedInputStream bis = new BufferedInputStream(fis)) {
				try (ObjectInputStream ois = new ObjectInputStream(bis)) {
					List<Project> project = (List<Project>) ois.readObject();
					return project;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
