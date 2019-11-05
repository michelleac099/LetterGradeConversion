import java.util.Scanner;
public class GPACalculationVer2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String n1,n2,n3,n4,n5;
		double c1,c2,c3,c4,c5;
		String g1,g2,g3,g4,g5;
		double valueG1,valueG2,valueG3,valueG4,valueG5;
		
		
		System.out.println("Course 1 name: ");
		n1 = in.next();
		System.out.println("Course 1 credits: ");
		c1 = in.nextDouble();
		System.out.println("Course 1 grade: ");
		g1 = in.next();
		
		System.out.println("Course 2 name: ");
		n2 = in.next();
		System.out.println("Course 2 credits: ");
		c2 = in.nextDouble();
		System.out.println("Course 2 grade: ");
		g2 = in.next();
		
		System.out.println("Course 3 name: ");
		n3 = in.next();
		System.out.println("Course 3 credits: ");
		c3 = in.nextDouble();
		System.out.println("Course 3 grade: ");
		g3 = in.next();
		
		System.out.println("Course 4 name: ");
		n4 = in.next();
		System.out.println("Course 4 credits: ");
		c4 = in.nextDouble();
		System.out.println("Course 4 grade: ");
		g4 = in.next();
		
		System.out.println("Course 5 name: ");
		n5 = in.next();
		System.out.println("Course 5 credits: ");
		c5 = in.nextDouble();
		System.out.println("Course 5 grade: ");
		g5 = in.next();
		
		double totalCredits = c1+c2+c3+c4+c5;
		
		if (g1.contentEquals("A"))
			valueG1 = 4.0;
		else if(g1.contentEquals("A-"))
			valueG1 = 3.7;
		else if (g1.contentEquals("F")|| g1.contentEquals("WF"))
			valueG1 = 0;
		else if (g1.contentEquals("B"))
			valueG1 = 3.0;
		else if (g1.contentEquals("B+"))
			valueG1 = 3.3;
		else if(g1.contentEquals("B-"))
			valueG1 = 2.7;
		else if (g1.contentEquals("C"))
			valueG1 = 2.0;
		else if(g1.contentEquals("C+"))
			valueG1 = 2.3;
		else if(g1.contentEquals("C-"))
			valueG1 = 1.7;
		else if (g1.contentEquals("D"))
			valueG1 = 1.0;
		else if(g1.contentEquals("D+"))
			valueG1 = 1.3;
		else if(g1.contentEquals("D-"))
			valueG1 = 0.7;
		
		
		
		
		
	} //main

} //class
