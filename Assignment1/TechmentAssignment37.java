package com.Techment.demo;

public class TechmentAssignment37 {
public static void main(String[] args) {
	int counter = 1;
	
	for (int i=0;i<5;i++)
	{
		int x= (5-i);
		while (x>1 && x<6) {
			System.out.print(" ");
			x--;
			
		}
			
		for(int j=counter;j>1;j--)
			System.out.print(j);
		
		//if(counter<5)
		System.out.print(1);
		for(int j=2;j<=counter;j++)
			System.out.print(j);
		
		
		counter+=1;
		//int counter1 =4;
		if(counter==6)
		{System.out.println();
			int counter1 =4;
			while(counter1>0)
			{
				int xi= (5-counter1);
				while (xi>=1 && xi<6) {
					System.out.print(" ");
					xi--;
					
				}
			for(int j=counter1;j>1;j--)
				System.out.print(j);
			
			//if(counter<5)
			System.out.print(1);
			for(int j=2;j<=counter1;j++)
				System.out.print(j);
			counter1--;
			System.out.println();
			}
			
		}
		System.out.println();
	}
}
}
