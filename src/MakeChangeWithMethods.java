import java.util.Scanner;
public class MakeChangeWithMethods {
	public static void main(String[] args) {
		storefrontMenu();
		cashierInputs();
		System.out.println("\n\n•Thank you for shopping with RV Liquidators•");
	}
	public static void storefrontMenu() {
		System.out.println("-----       Welcome to RV Liquidators       -----");
		System.out.println("              • Se habla español •");
	}
	public static void cashierInputs() {
		Scanner kb = new Scanner(System.in);
		System.out.println("\nEnter the item cost: ");
		double priceItem = kb.nextDouble();
		System.out.print("Enter the amount tendered: ");
		double moneyTendered = kb.nextDouble();
		
		double changeReturned = moneyTendered - priceItem;
		double changeReturned2 = changeReturned;
		
		int twentyDollarCount = (int)(changeReturned / 20); changeReturned %= 20;
		int tenDollarCount = (int) (changeReturned / 10); changeReturned %= 10;
		int fiveDollarCount = (int) (changeReturned / 5); changeReturned %= 5;
		int oneDollarCount = (int) (changeReturned / 1); changeReturned %= 1;				
		int coinChangeReturned = (int) Math.round(changeReturned * 100); 
		int quarterCount = coinChangeReturned/25; coinChangeReturned %= 25;
		int dimeCount = coinChangeReturned/10; coinChangeReturned %= 10;
		int nickelCount = coinChangeReturned/5; coinChangeReturned %= 5;
		int pennyCount = coinChangeReturned/1; coinChangeReturned %= 1;
		
		String twentyDollarBill = "\t" + twentyDollarCount + " twenty dollar bill(s) "; 
		String tenDollarBill = "\t" + tenDollarCount + " ten dollar bill(s) ";	
		String fiveDollarBill = "\t" + fiveDollarCount + " five dollar bill(s) ";
		String oneDollarBill = "\t" + oneDollarCount + " one dollar bill(s) ";	
		String quarterCoin = "\t" + quarterCount + " quarter(s) ";
		String dimeCoin = "\t" + dimeCount + " dime(s) "; 
		String nickelCoin = "\t" + nickelCount + " nickel(s) ";	
		String pennyCoin = pennyCount + " pennies ";
		if (moneyTendered < priceItem) {
			System.err.println("Cost: $" + priceItem + " Amount Tendered: $" + 
								moneyTendered + " Amount tendered < item cost!");		
		} else if (moneyTendered == priceItem) {
			System.out.println("Cost: $" + priceItem + " Amount Tendered: $" + 
								moneyTendered + " Exact change provided!" + 
					"\n Thank you for shopping with RV Liquidators!");
		} else {
			System.out.println();
			System.out.println("Cost: $" + priceItem + " Amount Tendered: $" + 
								moneyTendered + " Change: $" + changeReturned2);
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
		}
		kb.close();
		}
}

