package com.Techment.demo;

import java.util.Scanner;
import java.lang.Math;

public class Assigmentquetionnumber6to20 {
	public static void main(String[] args)
	{
		//problem6calculator();
		//problem6calculator();
		problem21();
		//problemTodayQuestions();
		//Here Only all programs are there After 6 cdopy All functions Let me select and then u copy iok
	}
	
	public static void problem6calculator()
	{ Scanner scanner = new Scanner(System.in);  
	System.out.println("Enter the FirstNumber");
	int firstnumber = scanner.nextInt();
	System.out.println("Enter the Operator");
	char operator = scanner.next().charAt(0);
	System.out.println("Enter the SecondNumber");
	int secondnumber = scanner.nextInt();
	//here it is not able to check which statement to run let me run and show you
	
	
	
	switch(operator)
	{
	case '+' :
	{
		System.out.println("The SUm Of The Numbers Is " + (firstnumber + secondnumber));
		break;
	}

	case '-' :
	{
		System.out.println("The Difference  Of The Numbers Is " + (firstnumber - secondnumber));
		break;
	}

	case '*' :
	{
		System.out.println("The Multiplication  Of The Numbers Is " + (firstnumber * secondnumber));
		break;
	}
		

	case '/' :
	{
		System.out.println("The Division Of The Numbers Is " + (firstnumber / secondnumber));
		break;
	
	}
	
	}
	
	
	scanner.close();
	}


public static void problem7()
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the first number");
	int number1 = scanner.nextInt();
	System.out.println("Enter the second number");
	int number2 = scanner.nextInt();
	if(number1>0 && number2>number1)
	{
		for(int i = number1;i<=number2;i++)
		{
			System.out.println("Number " + i + "  Solder Can Go");
		}
	}
	else
		System.out.println("Please Enter the valid numbers");
	scanner.close();
}

public static void problem8()
{
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the 3 Digit Number");
	 int number = scanner.nextInt();
	 int i = number;
	 int armstrongnumber = 0;
	 while(i>0)
	 {
		 armstrongnumber +=Math.pow(i%10, 3);
		 i=i/10;
	 }
	 //System.out.println(armstrongnumber);
	 if(number == armstrongnumber)
		 System.out.println("Number is Armstrong Number");
	 else
		 System.out.println("Number is Armstrong Number");
	 
	 scanner.close();
}

public static void problem9()
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Last Number Uptil You Want Cubes");
	int number = scanner.nextInt();
	for(int i = 1;i<=number;i++)
	{
		System.out.print(Math.pow(i, 3)+" , ");
	}
	scanner.close();
}

public static void problem10()
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Last Number Uptil You Want Primes");
	int number = scanner.nextInt();
	for(int i =2;i<number;i++)
	{
		int count = 0;
		for(int j = 1 ; j <= i ; j++)	
		{
			if(i % j == 0)
				count = count+1;
		}
		if(count == 2)
			System.out.println(i);
	}
	
	scanner.close();
		
}

public static void problem11()
{
	for(int i =5;i>0;i--)
	{
		for(int j=1;j<i+1;j++)
		{
			System.out.print(j);
		}
		System.out.println("");
	}
}

public static void probelm12()
{
	int counter = 1;
	for (int i =5;i>(i-counter);i--)
	{
		System.out.println(i);
	}
}
public static void problem13()
{Scanner scanner = new Scanner(System.in);
int[] array = new int[10];
int max =0;

	 System.out.println("How Many Numbers You Want to Insert");
	 int number = scanner.nextInt();
	 for (int i =0; i < number;i++)
	 {
		 System.out.println("Insert The Number");
		 array[i]=scanner.nextInt();
	 }
	 for (int i=0; i<number; i++)   
	 {
		 if(array[i]>max)
		 {
			 max =array[i];
		 }
	
	 }  
	System.out.println("The Maximum Among All the elements "+max); 
	scanner.close();
}

public static void problem14()
{	Scanner scanner = new Scanner(System.in);
	int[] array = new int[10];
	int max =0;	
	 System.out.println("How Many Numbers You Want to Insert");
	 int number = scanner.nextInt();
	 for (int i =0; i < number;i++)
	 {
		 System.out.println("Insert The Number");
		 array[i]=scanner.nextInt();
	 }
	 for (int i=0; i<number; i++)   
	 { max +=array[i];
		
	
	 }  
	System.out.println("The Sum Among All the elements "+max);
	scanner.close();
}

public static void problem15()
{
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the Number of elements in each Array");
	 int number = scanner.nextInt();
	 int check =0;
	 int[] array1 = new int[number];
	 int[] array2 = new int[number];
	 
	 for (int i =0; i < number;i++)
	 {
		 System.out.println("Insert The Number in 1st Array");
		 array1[i]=scanner.nextInt();
	 }
	 
	 for (int i =0; i < number;i++)
	 {
		 System.out.println("Insert The Number in 2nd Array");
		 array2[i]=scanner.nextInt();
	 }
	 
	 
	 for(int i =0;i<number;i++)
	 {
		 if(array1[i]==array2[i])
			 check+=1;
	 }
	 if(check==number)
		 System.out.println("Both Arrays Are Same");
	 else
		 System.out.println("Both Arrays Are Not Same");
	 
	 scanner.close();
}

public static void problem16()
{
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int number = scanner.nextInt();
	 if(number % 8 ==0 && number % 3 == 0)
		 System.out.println(number + " The Number Is divisible by 8 as well as 3");
	 else
		 System.out.println(number + " The Number Is Not divisible by 8 and 3");
	 
	 scanner.close();
}

public static void problem17()
{
	try {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the Age");
		 int Age = scanner.nextInt();
		 scanner.close();
		 if(Age>=18)
			 System.out.println("Welcome To Vote");
		 else
			 throw new Exception();
	}
	catch(Exception e)
	{
		System.out.println("InAppropriate Age");
	}
	//scanner.close();
}

public static void problem18()
{
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the First Number");
	 int numerator = scanner.nextInt();
	 System.out.println("Enter the Second Number");
	 int denominator = scanner.nextInt();
	 scanner.close();
	 try {
	 if(denominator==0)
	 {
		 throw new ArithmeticException();
	 }
	 }
	 catch(ArithmeticException ex)
	 {
		 System.out.println("ArithmeticException");
	 }
	 finally {
		System.out.println("Inside Finally Block");
	}
	 scanner.close();
}

public static void problemTodayQuestions()
{

	/*Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Table Number");
	int Table = scanner.nextInt();
	System.out.println("Enter the Number Uptil You Want Table");
	int number = scanner.nextInt();
	for(int i =1;i<number+1;i++)
	{
		System.out.println(Table +" * "+ i +" = "+Table*i);
	}
	
	scanner.close();*/
	
	////Problem Number 1
	for(int i =0;i<3;i++)
	{
		for (int j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
	System.out.println(" ");
	
	/////Problem Number 2 
	for(int i =0;i<3;i++)
	{
		for (int j=0;j<=i;j++)
		{
			System.out.print(j+1);
		}
		System.out.println(" ");
	}
	System.out.println(" ");
	
/////Problem Number 5 
	
	for(int i =0;i<5;i++)
	{
		for (int j=0;j<=i;j++)			
		{
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println(" ");
	}
	System.out.println(" ");
	
	//////Problem Number 4
	int k=1;
	for(int i =1;i<4;i++)
	{
		for (int j=0;j<i;j++)
		{
			System.out.print(k++);
		}
		System.out.println(" ");
	}
	/////Problem Number 3
	for(int i = 1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1||j==1||i==5||j==5) {
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println(" ");
	}
}

public static void problem19()
{int counter =1;
	for(int i =6;i>0;i--)
	{ 
		for(int z =0;z<counter;z++)
		System.out.print(" ");
		for(int j=1;j<=i;j++)
			System.out.print(j);
		for(int k =(i-1);k>0;k--)
			System.out.print(k);
		counter+=1;
		System.out.println();
		
	}
					
}
public static void problem20()
{
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the Number of elements in each Array");
	 int number = scanner.nextInt();
	 //int check =0;
	 int[] array1 = new int[number];
	 //int[] array2 = new int[number];
	 
	 for (int i =0; i < number;i++)
	 {
		 System.out.println("Insert The Number in the Array");
		 array1[i]=scanner.nextInt();
	 }
	 System.out.println("Enter The Index number Value You Want To Find : ");
	
	 try
	 {
		 int index = scanner.nextInt();
		 scanner.close();
		 System.out.println("The Desired Index Number Is : " + array1[index-1]);
	/* if(index<=number&&index>0)
	 {
		 
	 }*/
	 
	 }
	 catch(ArrayIndexOutOfBoundsException e)
	 {
		 System.out.println("Index Is Out Of Bound");
	 }
					
}
public static void problem21()
{
	Scanner scanner = new Scanner(System.in);
	int marks[] = new int[5];
	int sum =0;
	int max=0,min=0,max2=0,result=0;
	 
	 //int number = scanner.nextInt();
	 //For insertion Of Marks
	 for (int i =0; i <5;i++)
	 {
		 System.out.println("Insert The Marks of Subject "+(i+1));
		 marks[i]=scanner.nextInt();
	 }
	 //For Displaying the marks
	 for (int i=0; i<marks.length; i++)   
	 { System.out.println("Marks of Subject " +(i+1)+" is :"+marks[i]);
	 sum+=marks[i];
	
	 }
	 //For Displaying Sum of the marks
	System.out.println("The Sum Among All the Marks : "+sum);
	min=marks[0];
	//For Taking Out Top Marks and Lowest Marks
	for(int i = 0;i<marks.length;i++)
	{
		if(marks[i]>max)
		{
			max=marks[i];
		}
		if(marks[i]<min)
		{
			min=marks[i];
		}
	}
	System.out.println("Maximum marks is : "+max);
	System.out.println("Minimum marks is : "+min);
	max2=max;
	//To Get The Second Maximum Marks
	for(int i = 0;i<marks.length;i++)
	{
		if((max-marks[i])< max2 &&(max-marks[i])!=0 )
		{
			max2=marks[i];
		}
		
	}
	System.out.println("Second Maximum marks is : "+max2);
	//To Get The Second Maximum Marks
	for(int i = 0;i<marks.length;i++)
	{
		if(marks[i]<40)
		{
			result+=1;
		}
		if(result==1)
		{
			break;
		}
		
	}
	
	if(result==1)
		System.out.println("STudent is Fail");
	else
		System.out.println("Student is pass");
	scanner.close();
}
public static void problem22()
{
		/*int arr[][]=new int[4][];
	arr[0]=new int[2];
	arr[1]=new int[7];
	arr[2]=new int[4];
	arr[3]=new int[8];
	for(int i = 0;i<arr.length;i++)
	{
		for(int j= 0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}*/
		
}
}

