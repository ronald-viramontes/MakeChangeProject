import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
										//STORE FRONT//
		System.out.println(" -----------------------   Welcome to RV Liquidators   ------------------------");
		System.out.println("\n                 Please enter the purchase price of the item        ");
			double priceItem = kb.nextDouble();
		System.out.println("        Please enter the amount of money you will be paying with         ");
			double moneyTendered = kb.nextDouble();
					
									//CURRENCY VARIABLES//
		double tenDollar = 10;		String tenDollarBill = " ten dollar bill";
		double fiveDollar = 5;		String fiveDollarBill = " five dollar bill";
		double oneDollar = 1;		String oneDollarBill = " one dollar bill";
		double quarter = .25;		String quarterCoin = " quarters";
		double dime = .1;			String dimeCoin = " dimes"; 
		double nickel = .05;		String nickelCoin = " nickels";
		double penny = .01;			String pennyCoin = " pennies";
					
					//ITEM COST & AMOUNT TENDERED FORMULA//
			double changeReturned = (moneyTendered - priceItem);

			//-----------------------Bill & Coin Count Variables--------------------//
										//BILLS//
						double changeReturned2 = changeReturned;
						int twentyDollarCount = (int)(changeReturned / 20);
						changeReturned %= 20;
						int tenDollarCount = (int) (changeReturned / 10);
						changeReturned %= 10;
						int fiveDollarCount = (int) (changeReturned / 5);
						changeReturned %= 5;
						int oneDollarCount = (int) (changeReturned / 1);
						changeReturned %= 1;				
										//COINS//
						int coinChangeReturned = (int) Math.round(changeReturned * 100);
						int quarterCount = coinChangeReturned/25;
						coinChangeReturned %= 25;
						int dimeCount = coinChangeReturned/10;
						coinChangeReturned %= 10;
						int nickelCount = coinChangeReturned/5;
						coinChangeReturned %= 5;
						int pennyCount = coinChangeReturned/1;
						coinChangeReturned %= 1;
						
								//STATEMENTS IF AMOUNT TENDERED IS EQUAL TO THE ITEM AMOUNT & LESS THAN THE ITEM AMOUNT//
			if (moneyTendered < priceItem) {
				System.out.println("Cost: " + priceItem + " Amount Tendered: " + moneyTendered + " The amount tendered is less than the purchase price!");		
			} else if (moneyTendered == priceItem) {
				System.out.println("Cost: " + priceItem + " Amount Tendered: " + moneyTendered + " You have provided exact change!" + 
						"\n Thank you for shopping with us!  Have a great day!");
			} else {
				
				System.out.println("\t  Cost: " + priceItem + " Amount Tendered: " + moneyTendered + " Change: " + changeReturned2);
				System.out.println("*** Return Bills: " + tenDollarCount + tenDollarBill + " " + fiveDollarCount + fiveDollarBill + " " + oneDollarCount + oneDollarBill + " ***");
				System.out.println("\t*** Return Coins: " + quarterCount + quarterCoin + " " + dimeCount + dimeCoin + " " + nickelCount + nickelCoin + " " + pennyCount + pennyCoin + " ***");
				
							
				System.out.println("\n\t--------Thank you for shopping with RV Liquidators--------");
			} kb.close();		
		}
	} 


