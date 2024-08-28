package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Course> courses = new HashSet<>();
		
		try {
			System.out.print("How many students for course A? ");
			int n = sc.nextInt();
			
			for (int i=0; i < n; i++) {
				System.out.print("ID: ");
				int idS = sc.nextInt();
				courses.add(new Course(idS));
			}
			
			System.out.print("How many students for course B? ");
			n = sc.nextInt();
			
			for (int i=0; i < n; i++) {
				System.out.print("ID: ");
				int idS = sc.nextInt();
				courses.add(new Course(idS));
			}
			
			System.out.print("How many students for course C? ");
			n = sc.nextInt();
			
			for (int i=0; i < n; i++) {
				System.out.print("ID: ");
				int idS = sc.nextInt();
				courses.add(new Course(idS));
			}
			
			System.out.println("Total students: " + courses.size());
		
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}finally {
			sc.close();
		}
	}
}
