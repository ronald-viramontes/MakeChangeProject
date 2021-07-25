import java.util.Scanner;

public class MakeChange {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
							//CURRENCY VARIABLES//
							//CURRENCY VARIABLES//
		int quarterCount = 0, dimeCount = 0, nickelCount = 0, pennyCount = 0; 
		int oneDollarCount = 0, fiveDollarCount = 0, tenDollarCount = 0;
	
		System.out.println(" -----------------------   Welcome to My Store   ------------------------");
		System.out.println("        Please enter the cost of the item that you are purchasing        ");
			double priceItem = kb.nextDouble();
		System.out.println("        Please enter the amount of money you will be paying with         ");
					
		double tenDollar = 10;		String tenDollarBill = " ten dollar bill";
		double fiveDollar = 5;		String fiveDollarBill = " five dollar bill";
		double oneDollar = 1;		String oneDollarBill = " one dollar bill";
		double quarter = .25;		String quarterCoin = " quarters";
		double dime = .1;			String dimeCoin = " dimes"; 
		double nickel = .05;		String nickelCoin = " nickels";
		double penny = .01;			String pennyCoin = " pennies";
			double moneyTendered = kb.nextDouble();
			double changeReturned = (moneyTendered - priceItem);
			tenDollarCount = (int) Math.floor(changeReturned/10);
			fiveDollarCount = (int)Math.floor(changeReturned - tenDollarCount)/10;
			oneDollarCount = (int) Math.floor(changeReturned - tenDollarCount * 10 - fiveDollarCount * 5);
								//-----------------------Bill & Coin Count Variables--------------------//
			quarterCount = (int)Math.round(changeReturned - tenDollarCount * 10 - fiveDollarCount * 5 - oneDollarCount * 1 - dimeCount * .1 - nickelCount * .05 - pennyCount);
			dimeCount = (int)Math.round(changeReturned - tenDollarCount * 10 - fiveDollarCount * 5 - oneDollarCount * 1 - quarterCount * .25 - dimeCount * .1 - nickelCount * .05 - pennyCount);
			nickelCount = (int)Math.floor(changeReturned - tenDollarCount * 10 - fiveDollarCount * 5 - oneDollarCount * 1 - quarterCount * .25 - dimeCount * .1 - nickelCount * .05 - pennyCount);
			pennyCount = (int) Math.floor(changeReturned - tenDollarCount * 10 - fiveDollarCount * 5 - oneDollarCount * 1 - quarterCount * .25 - dimeCount * .1 - nickelCount * .05 - pennyCount);
//			changeReturned = Math.round(changeReturned*100)/100;
				
			if (moneyTendered < priceItem) {
				System.out.println("Cost: " + priceItem + " Amount Tendered: " + moneyTendered + " The amount tendered is less than the purchase price!");		
			} else if (moneyTendered == priceItem) {
				System.out.println("Cost: " + priceItem + " Amount Tendered: " + moneyTendered + " You have provided exact change!" + 
						"\n Thank you for shopping with us!  Have a great day!");
			} else {
				
				System.out.println("Cost: " + priceItem + " Amount Tendered: " + moneyTendered + " Change: " + changeReturned);
				
					//TENS//
				if (tenDollarCount > 0 ) {
					changeReturned = (int) Math.floor(tenDollarCount/10) ;
					System.out.println("line 57 " + tenDollarCount + tenDollarBill);
				}	
					//FIVES//
				if (fiveDollarCount > 0) {						
					changeReturned = (int) Math.floor(fiveDollarCount/5);
					System.out.println("line 62 " + fiveDollarCount + fiveDollarBill);
				}							
					//ONES//
				if (oneDollarCount > 0 ) {
					changeReturned = (int) Math.floor(oneDollarCount/1);
					System.out.println("line 68 " + oneDollarCount + oneDollarBill);
				}				
					//QUARTERS//
				if (quarter > 0 ) {
					changeReturned = (int) Math.floor(quarterCount/.25);
					System.out.println("line 73 " + quarterCount + quarterCoin);
				}
					//DIMES//
				if (dime > 0) {					
					changeReturned = (int) Math.floor(dimeCount/.10);
					System.out.println("line 84 " + dimeCount + dimeCoin);
				}					
					//NICKELS//
				if (nickel > 0) {						
					changeReturned = (int) Math.floor(nickelCount/.05);
					System.out.println("line 89 " + nickelCount + nickelCoin);
				}	
					//PENNIES//			
				if (penny > 0) {
					changeReturned = (int) Math.floor(pennyCount/.01);
					System.out.println("line 94 " + pennyCount + pennyCoin);
				}  											
			} kb.close();		
		}
	} 


