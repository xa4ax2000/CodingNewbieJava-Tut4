import java.util.Scanner;

public class Calc {
	public static void main(String args[]){
		Scanner andrew = new Scanner(System.in);
		double num1, num2, num3;
		System.out.println("Enter first number: ");
		num1 = andrew.nextDouble();
		System.out.println("Enter second number: ");
		num2 = andrew.nextDouble();
		num3 = num1 + num2;
		System.out.println(num3);
		
	}
}
