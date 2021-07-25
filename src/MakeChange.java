import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
										//STORE FRONT//
		System.out.println(" -----------------------   Welcome to RV Liquidators   ------------------------");
		System.out.println("                             • Se habla español •                               ");
		System.out.println("\n                 Please enter the purchase price of the item        ");
			double priceItem = kb.nextDouble();
		System.out.println("        Please enter the amount of money you will be paying with         ");
			double moneyTendered = kb.nextDouble();
					
									//CURRENCY STRINGS VARIABLES//
//				String twentyDollarBill = twentyDollarCount + " twenty dollar bill(s) "; 
//				String tenDollarBill = tenDollarCount + " ten dollar bill(s) ";	
//				String fiveDollarBill = fiveDollarCount + " five dollar bill(s) ";
//				String oneDollarBill = oneDollarCount + " one dollar bill(s) ";	String quarterCoin = quarterCount + " quarter(s) ";
//				String dimeCoin = dimeCount + " dime(s) "; String nickelCoin = nickelCount + " nickel(s) ";	String pennyCoin = pennyCount + " pennies ";
					
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
						
						String twentyDollarBill = twentyDollarCount + " twenty dollar bill(s) "; 
						String tenDollarBill = tenDollarCount + " ten dollar bill(s) ";	
						String fiveDollarBill = fiveDollarCount + " five dollar bill(s) ";
						String oneDollarBill = oneDollarCount + " one dollar bill(s) ";	String quarterCoin = quarterCount + " quarter(s) ";
						String dimeCoin = dimeCount + " dime(s) "; String nickelCoin = nickelCount + " nickel(s) ";	String pennyCoin = pennyCount + " pennies ";
								//STATEMENTS IF AMOUNT TENDERED IS EQUAL TO THE ITEM AMOUNT & LESS THAN THE ITEM AMOUNT//
			if (moneyTendered < priceItem) {
				System.out.println("Cost: $" + priceItem + " Amount Tendered: $" + moneyTendered + " The amount tendered is less than the purchase price!");		
			} else if (moneyTendered == priceItem) {
				System.out.println("Cost: $" + priceItem + " Amount Tendered: $" + moneyTendered + " You have provided exact change!" + 
						"\n Thank you for shopping with us!  Have a great day!");
			} else {
								//SYSOUT FOR ITEM COST, AMOUNT TENDERED, CHANGE DUE --> BILLS OWED & COINS OWED//
				System.out.println("\t  Cost: $" + priceItem + " Amount Tendered: $" + moneyTendered + " Change: $" + changeReturned2);
				System.out.println("\n • Return Bills: " + twentyDollarBill + tenDollarBill + "\n\t\t    " + fiveDollarBill + oneDollarBill);
				System.out.println("\n • Return Coins: " + quarterCoin + dimeCoin + nickelCoin + pennyCoin);					
				System.out.println("\n\t--------Thank you for shopping with RV Liquidators--------");
			} kb.close();		
		}
	} 


