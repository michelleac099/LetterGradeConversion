import java.util.Scanner;
public class GPACalculationVer2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String n1,n2,n3,n4,n5;
		double c1,c2,c3,c4,c5;
		String g1,g2,g3,g4,g5;
		double valueG1 = 0;
		double valueG2 = 0;
		double valueG3 = 0;
		double valueG4 = 0;
		double valueG5 = 0;
		
		
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
		
		//Converting class 1 grade
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
		
		//Converting class 2 grade
		if (g2.contentEquals("A"))
			valueG2 = 4.0;
		else if(g2.contentEquals("A-"))
			valueG2 = 3.7;
		else if (g2.contentEquals("F")|| g1.contentEquals("WF"))
			valueG2 = 0;
		else if (g2.contentEquals("B"))
			valueG2 = 3.0;
		else if (g2.contentEquals("B+"))
			valueG2 = 3.3;
		else if(g2.contentEquals("B-"))
			valueG2 = 2.7;
		else if (g2.contentEquals("C"))
			valueG2 = 2.0;
		else if(g2.contentEquals("C+"))
			valueG2 = 2.3;
		else if(g2.contentEquals("C-"))
			valueG2 = 1.7;
		else if (g2.contentEquals("D"))
			valueG2 = 1.0;
		else if(g2.contentEquals("D+"))
			valueG2 = 1.3;
		else if(g2.contentEquals("D-"))
			valueG2 = 0.7;
		
		//Converting class 3 grade
		if (g3.contentEquals("A"))
			valueG3 = 4.0;
		else if(g3.contentEquals("A-"))
			valueG3 = 3.7;
		else if (g3.contentEquals("F")|| g1.contentEquals("WF"))
			valueG3 = 0;
		else if (g3.contentEquals("B"))
			valueG3 = 3.0;
		else if (g3.contentEquals("B+"))
			valueG3 = 3.3;
		else if(g3.contentEquals("B-"))
			valueG3 = 2.7;
		else if (g3.contentEquals("C"))
			valueG3 = 2.0;
		else if(g3.contentEquals("C+"))
			valueG3 = 2.3;
		else if(g3.contentEquals("C-"))
			valueG3 = 1.7;
		else if (g3.contentEquals("D"))
			valueG3 = 1.0;
		else if(g3.contentEquals("D+"))
			valueG3 = 1.3;
		else if(g3.contentEquals("D-"))
			valueG3 = 0.7;
		
		//Converting class 3 grade
		if (g4.contentEquals("A"))
			valueG4 = 4.0;
		else if(g4.contentEquals("A-"))
			valueG4 = 3.7;
		else if (g4.contentEquals("F")|| g1.contentEquals("WF"))
			valueG4 = 0;
		else if (g4.contentEquals("B"))
			valueG4 = 3.0;
		else if (g4.contentEquals("B+"))
			valueG4 = 3.3;
		else if(g4.contentEquals("B-"))
			valueG4 = 2.7;
		else if (g4.contentEquals("C"))
			valueG4 = 2.0;
		else if(g4.contentEquals("C+"))
			valueG4 = 2.3;
		else if(g4.contentEquals("C-"))
			valueG4 = 1.7;
		else if (g4.contentEquals("D"))
			valueG4 = 1.0;
		else if(g4.contentEquals("D+"))
			valueG4 = 1.3;
		else if(g4.contentEquals("D-"))
			valueG4 = 0.7;
		
		//Converting class 5 grade
		if (g5.contentEquals("A"))
			valueG5 = 4.0;
		else if(g5.contentEquals("A-"))
			valueG5 = 3.7;
		else if (g5.contentEquals("F")|| g1.contentEquals("WF"))
			valueG5 = 0;
		else if (g5.contentEquals("B"))
			valueG5 = 3.0;
		else if (g5.contentEquals("B+"))
			valueG5 = 3.3;
		else if(g5.contentEquals("B-"))
			valueG5 = 2.7;
		else if (g5.contentEquals("C"))
			valueG5 = 2.0;
		else if(g5.contentEquals("C+"))
			valueG5 = 2.3;
		else if(g5.contentEquals("C-"))
			valueG5 = 1.7;
		else if (g5.contentEquals("D"))
			valueG5 = 1.0;
		else if(g5.contentEquals("D+"))
			valueG5 = 1.3;
		else if(g5.contentEquals("D-"))
			valueG5 = 0.7;
		
		//Calculating grade points for each class
		double gradePts1 = c1*valueG1;
		double gradePts2 = c2*valueG2;
		double gradePts3 = c3*valueG3;
		double gradePts4 = c4*valueG4;
		double gradePts5 = c5*valueG5;
	
		//Calculating the GPA
		double gpa = (gradePts1+gradePts2+gradePts3+gradePts4+gradePts5)/(totalCredits);
		
		//Displaying the input courses
		System.out.println("Course | Credits | Grade | Grade Points");
		System.out.println("--------------------------------------------------------");
		System.out.println(n1 + "   " + c1 + "    " + g1 + "   " + gradePts1);
		System.out.println(n2 + "   " + c2 + "    " + g2 + "   " + gradePts2);
		System.out.println(n3 + "   " + c3 + "    " + g3 + "   " + gradePts3);
		System.out.println(n4 + "   " + c4 + "    " + g4 + "   " + gradePts4);
		System.out.println(n5 + "   " + c5 + "    " + g5 + "   " + gradePts5);
		
		System.out.println(" ");
		System.out.print("GPA = ");
		System.out.printf("%2f", gpa);
		
		in.close();
		
	} //main

} //class
