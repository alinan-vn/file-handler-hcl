import java.io.*;
import java.util.Scanner;

import people.People;

public class App {

	public static void main(String[] args) throws IOException {
		
		People steve = new People("Steve", 26, "Violet");
		steve.addToRecords();
		
		People sam = new People("Sam", 22, "Blue");
		sam.addToRecords();
		
		People josh = new People("Josh", 24, "Brown");
		josh.addToRecords();
		
		People lucy = new People("Lucy", 22, "Blue");
		lucy.addToRecords();
	
		People jen = new People("Jen", 33, "Green");
		jen.addToRecords();
		
		jen.readCurrentRecords();
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String enterName = scanner.nextLine();
		
		System.out.println("Please enter your age (note: only integer values will pass): ");
		int enterAge = scanner.nextInt();
		
		System.out.println("Please enter your favorite color: ");
		String enterFavoriteColor = scanner2.nextLine();
		scanner2.nextLine();
				
		People enteredPerson = new People(enterName, enterAge, enterFavoriteColor);
		enteredPerson.readBeforeAdd();
		enteredPerson.addToRecords();
		enteredPerson.readCurrentRecords();
		
	}	
}