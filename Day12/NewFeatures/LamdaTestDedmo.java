package com.Techment.Day12.NewFeatures;

interface Checking
{
	String getLargest(int a ,int b,int c);
}

public class LamdaTestDedmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking checking =(a,b,c)->
				{
					if(a>b && a>c)
						return a+" is Greatest";
					else if(b>c&&b>a)
						return b+" is Greatest";
					else
						return c+" is Greatest";
				};
				System.out.println(checking.getLargest(25, 88, 97));
	}

}
