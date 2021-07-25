import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
														//STORE FRONT//
		System.out.println("\t\t -----------------------   Welcome to RV Liquidators   ------------------------");
		System.out.println("\t\t                             • Se habla español •                               ");
		System.out.println("\n\t\t                 Please enter the purchase price of the item        ");
			double priceItem = kb.nextDouble();
		System.out.println("\t\t        Please enter the amount of money you will be paying with         ");
			double moneyTendered = kb.nextDouble();
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
											//STRING CONCATENATION// 
						String twentyDollarBill = "\t" + twentyDollarCount + " twenty dollar bill(s) "; 
						String tenDollarBill = "\t" + tenDollarCount + " ten dollar bill(s) ";	
						String fiveDollarBill = "\t" + fiveDollarCount + " five dollar bill(s) ";
						String oneDollarBill = "\t" + oneDollarCount + " one dollar bill(s) ";	
						String quarterCoin = "\t" + quarterCount + " quarter(s) ";
						String dimeCoin = "\t" + dimeCount + " dime(s) "; 
						String nickelCoin = "\t" + nickelCount + " nickel(s) ";	
						String pennyCoin = pennyCount + " pennies ";
								//STATEMENTS IF AMOUNT TENDERED IS EQUAL TO THE ITEM AMOUNT & LESS THAN THE ITEM AMOUNT//
			if (moneyTendered < priceItem) {
				System.out.println("Cost: $" + priceItem + " Amount Tendered: $" + moneyTendered + " The amount tendered is less than the purchase price!");		
			} else if (moneyTendered == priceItem) {
				System.out.println("Cost: $" + priceItem + " Amount Tendered: $" + moneyTendered + " You have provided exact change!" + 
						"\n Thank you for shopping with us!  Have a great day!");
			} else {
								//SYSOUT FOR ITEM COST, AMOUNT TENDERED, CHANGE DUE --> BILLS OWED & COINS OWED//
				System.out.println("\t\t\t  Cost: $" + priceItem + " Amount Tendered: $" + moneyTendered + " Change: $" + changeReturned2);
				
										//CAN ENABLE LINES 58 & 59 TO DISPLAY ALL BILLS AND COINS EVEN IF QUANTITY IS ZERO//
//				System.out.println("\n • Return Bills: " + twentyDollarBill + tenDollarBill + "\n\t\t    " + fiveDollarBill + oneDollarBill);
//				System.out.println("\n • Return Coins: " + quarterCoin + dimeCoin + nickelCoin + pennyCoin);					
			} 
			if (twentyDollarCount > 0) {
			      System.out.println(twentyDollarBill);
			        }
			     if (tenDollarCount > 0) {
			             System.out.print(tenDollarBill);
			        }
				if (fiveDollarCount > 0) {
			      System.out.print(fiveDollarBill);
			      }
				if (oneDollarCount > 0) {
			      System.out.print(oneDollarBill);
			      }
				if (quarterCount > 0) {
			      System.out.print(quarterCoin);
			      }
			    if (dimeCount > 0) {
					System.out.print(dimeCoin);
			      }
			    if(nickelCount > 0) {
					System.out.print(nickelCoin);
			      }
			    if (pennyCount > 0) {
					System.out.print(pennyCoin);
			      }
			    System.out.println("\n\n\t--------Thank you for shopping with RV Liquidators--------");
			
			kb.close();		
		}
	} 


