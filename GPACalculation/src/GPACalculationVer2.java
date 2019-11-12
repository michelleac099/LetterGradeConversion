import java.util.Scanner;
public class GPACalculationVer2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double number = 0;
		double gpa = 0;
		double gradePoints = 0;
		double totalNumberGrade = 0;
		int totalCreditHours = 0;
		String courseInfo;
		
		System.out.print("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit: ");
		
		while(in.hasNext()) {
			
			//Quit option
			courseInfo = in.next();
			if(courseInfo.contentEquals("Q")) 
				break;
			
			//Array splitting
			String [] data = courseInfo.split(",");
			String info = data[0];
			int hours = Integer.parseInt(data[1]);
			String letter = data[2];
			
			//Grade conversions
			if(letter.contentEquals("A") || letter.contentEquals("A+"))
				number = 4.0;
			else if(letter.contentEquals("A-"))
				number = 3.7;
			else if(letter.contentEquals("B+"))
				number = 3.3;
			else if(letter.contentEquals("B"))
				number = 3.0;
			else if(letter.contentEquals("B-"))
				number = 2.7;
			else if(letter.contentEquals("C+"))
				number = 2.3;
			else if(letter.contentEquals("C"))
				number = 2.0;
			else if(letter.contentEquals("C-"))
				number = 1.7;
			else if(letter.contentEquals("D+"))
				number = 1.3;
			else if(letter.contentEquals("D"))
				number = 1.0;
			else if(letter.contentEquals("D-"))
				number = 0.7;
			else if(letter.contentEquals("F") || letter.contentEquals("WF"))
				number = 0.0;
			else if(letter.contentEquals("P") || letter.contentEquals("NP") || letter.contentEquals("I"))
				hours = 0;
			else
				System.out.println("Invalid letter grade, please enter a different value: ");
			
			//Calculations
			gradePoints += (number * hours);
			totalCreditHours += hours;
			totalNumberGrade += number;
			gpa = gradePoints/totalCreditHours;
			System.out.print("Enter course information separated by commas (title, credit hours, letter grade) or type Q to quit: ");
			
		}//while loop
		
		System.out.print("Your GPA is: ");
		System.out.printf("%.3f", gpa);
		
	} //main

} //class
