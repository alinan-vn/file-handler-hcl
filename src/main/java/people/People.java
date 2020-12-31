package people;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

import java.util.Scanner;

public class People {

	String name;
	int age = 0;
	String favoriteColor;
	
	public People(String name, int age, String favoriteColor) {
		this.name = name;
		this.age = age;
		this.favoriteColor = favoriteColor;
	}
	
	final static String
		PEOPLE_RECORDS_PATH = "src/main/java/people/records.txt";
	
	public void addToRecords() {
		try {
			String personRecord = String.format("\n DATE ENTERED: [%s] -- %s is %s years old. Their favorite color is %s ! \n ========", new Date(), this.name, this.age, this.favoriteColor);
			Files.write(
				Paths.get(PEOPLE_RECORDS_PATH), 
				personRecord.getBytes(), 
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND
			);
		} catch (IOException e) {
			System.out.println("HIT?");
			e.printStackTrace();
		}
	}
	
	public void readCurrentRecords() throws IOException {
		System.out.println("READING CURRENT RECORDS");
		System.out.println("------------------------------------------");
		try {
			File currentRecords = new File(PEOPLE_RECORDS_PATH);
			Scanner myReader = new Scanner(currentRecords);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error Ocurred. Message: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("------------------------------------------");
		System.out.println("END OF CURRENT RECORDS");
	}
	
	public void readBeforeAdd() {
		System.out.println(this.name + " " + this.age + " " + this.favoriteColor);
	}
}