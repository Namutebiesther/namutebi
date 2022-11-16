package object_oriented;
import java.util.Scanner;

public class employee_salary {
	
	public static void main(String [] args) {
		double salary;
		double house,transport,tax;
		double gross, net;
		System.out.print("THE UNIVERSITY EMPLOYEE NET SALARY COMPUTATION\n");
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the basic salary: ");
		salary =input.nextDouble();
		house =.15*salary;
		transport =.25*salary;
		tax = .03*salary;
		gross = (house+transport+salary);
		net = gross-tax;
		System.out.println("The gross pay is: "+gross);
		System.out.println("The net pay is: "+net);
		
		
	}
	

}
