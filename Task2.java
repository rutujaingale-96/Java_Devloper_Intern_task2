//package internship;

import java.util.Scanner;

public class Task2 {
	public static void main(String args[]) {
	//Primitive data types
	byte a=10;	//1byte
	short b=20;	//2byte
	int c=30;	//4byte
	Long d=40l;	//8byte
	Float e=10.3f;	//4byte
	double f=10.2;	//8byte
	char ch='a';	//2byte
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two float numbers :");
	//Console Input
	Float num1=sc.nextFloat();
	Float num2=sc.nextFloat();
	Float num3=num1+num2;
	//Console output
	System.out.println("Addition is:"+num3);
	
	Float num4=num1-num2;
	System.out.println("Substraction is:"+num4);
	
	Float num5=num1/num2;
	System.out.println("Division is:"+num5);
	
	//Type Casting
	int x=(int)f;
}
}