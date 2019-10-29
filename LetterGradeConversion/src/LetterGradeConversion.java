import java.util.Scanner;
public class LetterGradeConversion {

	public static void main(String[] args) {
		
		/* Program for converting a letter grade to a numeric value.
		 * A=4  B=3  C=2  D=1  F=0
		 * + adds 0.3   - subtracts 0.3 ..... A+ = 4.0
		 */
		
		Scanner in = new Scanner(System.in);
		
		String letterGrade;
		double loopControl = 0;
		double numericValue = 9;
		
		while (loopControl == 0) {
		System.out.print("Enter a letter grade or type 'Q' to quit: ");
		letterGrade = in.next();
		
		if (letterGrade.contentEquals("Q"))
			loopControl = 5;
		
		if (loopControl == 5)
			break; //Quit option
		
		//All of the letter grade equivalents
		if (letterGrade.contentEquals("A") | letterGrade.contentEquals("A+"))
			numericValue = 4.0;
		
		if(letterGrade.contentEquals("A-"))
			numericValue = 3.7;
			
		if (letterGrade.contentEquals("F"))
			numericValue = 0;
		
		if (letterGrade.contentEquals("B"))
			numericValue = 3.0;
		
		if (letterGrade.contentEquals("B+"))
			numericValue = 3.3;
		
		if(letterGrade.contentEquals("B-"))
			numericValue = 2.7;
		
		if (letterGrade.contentEquals("C"))
			numericValue = 2.0;
		
		if(letterGrade.contentEquals("C+"))
			numericValue = 2.3;
		
		if(letterGrade.contentEquals("C-"))
			numericValue = 1.7;
		
		if (letterGrade.contentEquals("D"))
			numericValue = 1.0;
		
		if(letterGrade.contentEquals("D+"))
			numericValue = 1.3;
		
		if(letterGrade.contentEquals("D-"))
			numericValue = 0.7;
		
		System.out.println("The numeric value is " + numericValue);
		System.out.println(" ");
		
		} //while loop
		
		in.close();
		
	} //main

} //class
