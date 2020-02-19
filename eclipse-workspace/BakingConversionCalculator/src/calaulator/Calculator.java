package calaulator;
import java.util.Scanner;
public class Calculator {
	
	public static void GramToCup(double gram)  
	{
		int num1=(int) (gram/100);
		System.out.print(num1);
	}
	public static void GramToSpoon(double gram)  
	{
		int num2=(int) (gram/8);
		System.out.print(num2);
	}
	public static void CupToGram(double cup)  
	{
		System.out.print(cup*100);
	}
	public static void CupToSpoon(double cup)  
	{
		System.out.print(cup*10);
	}
	public static void SpoonToGram(double spoon)  
	{
		System.out.print(spoon*10);
	}
	public static void SpoonToCup(double spoon)  
	{
		int num3=(int) (spoon/10);
		System.out.print(num3);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("Hi\nif you want to convert from gram to cup please enter 1\n"
				+ "if you want to convert from gram to spoon please enter 2\n"
				+ "if you want to convert from cup to gram please enter 3\n"
				+ "if you want to convert from cup to spoon please enter 4\n"
				+ "if you want to convert from spoon to gram please enter 5\n"
				+ "if you want to convert from spoon to cup please enter 6\n");
		int choice= input1.nextInt();
		
		System.out.println("How much (gram/cup/spoon) you want to convert?");
		int amount= input2.nextInt();
		
		if(choice==1)
			GramToCup(amount);
		if(choice==2)
			GramToSpoon(amount);
		if(choice==3)
			 CupToGram(amount);
		if(choice==4)
			CupToSpoon(amount);
		if(choice==5)
			SpoonToGram(amount);
		if(choice==5)
			SpoonToCup(amount);
		
	}

}
