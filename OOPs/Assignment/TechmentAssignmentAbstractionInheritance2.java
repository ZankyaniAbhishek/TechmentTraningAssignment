package com.Techment.OOPs.Assignment;

import java.util.Scanner;

interface Rewardable 
{
	int CalcRewardPoints(int amount);
}
abstract class PrepaidCard 
{
	int CardNo;
	double availableBalance,swipeLimit;
	
	 public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		CardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}
	boolean swipeCard (int amount)
	{
		 if(amount < swipeLimit && amount < availableBalance )
		return true;
		 else
			 return false;
	}
	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	 
	public void rechargeCard (int amount)
	{
		availableBalance=availableBalance+amount;
	}
	
}

class TravelCard extends PrepaidCard implements Rewardable  
{
	int rewardspoints;
	

	

	public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
//		this.rewardspoints = rewardspoints;
	}




	@Override
	public int CalcRewardPoints(int amount) {
		// TODO Auto-generated method stub
		rewardspoints =(int)(amount/100);
		return rewardspoints;
	}
}
public class TechmentAssignmentAbstractionInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Card Number : ");
		int cardnumber = scanner.nextInt();
		System.out.println("Enter Avaible Balance : ");
		int balance = scanner.nextInt();
		System.out.println("Enter Wipe Limit: ");
		int Limit = scanner.nextInt();
		
		
		TravelCard card = new TravelCard(cardnumber, balance, Limit);
		card.toString();
		System.out.println(card.toString());
		System.out.println("Please Enter the amount you want to Swipe ");
		int withrawamount=scanner.nextInt();
		//System.out.println("The Withdraw Amount is : " + card.swipeCard(withrawamount));
		if(card.swipeCard(withrawamount)==true)
		{
			System.out.println("Rewards Points Earned : " +card.CalcRewardPoints(withrawamount) );
		}
		else
			System.out.println("The Entered Amout is Too high to withdraw.");
		scanner.close();
		

	}

}
