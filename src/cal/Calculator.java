package cal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter num1 : ");
		int a= sc.nextInt();
		
		System.out.println("Please enter num2 : ");
		int b= sc.nextInt();
		
		System.out.println("Please select the operation to be performed \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication");
		
		int option;
		System.out.println("Please enter choice here: ");
		option=sc.nextInt();
		
		
		switch(option) {
		
		case 1: {
			
			if(option==1) {
			System.out.println("Addition :");
			float res= a+b;
			System.out.println("Result : "+res);}
			}
		      break;
		
		case 2: {
			
			if (option==2) {
			System.out.println("Subtraction :");
			float res= a-b;
			System.out.println("Result : "+res);
			}
			}
		     break;
		
		case 3: {
			
			if(option==3) {
			System.out.println("Division :");
			float res= a/b;
			System.out.println("Result : "+res);
			}}
		     break;
		
		case 4: {
			
			if(option==4) {
			System.out.println("Multiplication :");
			float res= a*b;
			System.out.println("Result : "+res);
			}}
		     break;
		
		 default:{
			 System.out.println("Please enter valid numbers");
			 break;
		 }
			
		}
		
		
		
		

	}

}


