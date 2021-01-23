package bank;

import java.util.Scanner;

public class bank {

	public bank() {
	}

	public static void main(String[] args) {
		
		BankAccount obj1 = new BankAccount("Kenny", "12345");
		obj1.showMenu();
		
	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(int amount)
	{
		if(amount != 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Deposited: "+previousTransaction);
		} 
		else if(previousTransaction < 0)
		{
			System.out.println("Withdraw: "+Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction occured");
		}
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Dobrrodosel "+customerName);
		System.out.println("Tvoj ID je "+customerId);
		System.out.println("\n");
		System.out.println("A. Preveri stanje ");
		System.out.println("B. Vnos na ban;ni racun");
		System.out.println("C. Dvig");
		System.out.println("D. Prejsna transakcija");
		System.out.println("E. Izhod");
		
		do
		{
			System.out.println("=================================================================================================================");
			System.out.println("KAJ ZELITE STORITI");
			System.out.println("=================================================================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
				
			case 'A':
				System.out.println("----------------------------------------------------------------");
				System.out.println("STANJE RACUNA = "+balance);
				System.out.println("----------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------------------------------------------------------");
				System.out.println("VNESITE ZELEJNI ZNESEK KATEREGA ZELISTE NALOZITI NA RACUN:");
				System.out.println("----------------------------------------------------------------");
				int amout = scanner.nextInt();
				deposit(amout);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------------------------------------------------------");
				System.out.println("VNESITE ZNESEK KATERGA ZELISTE DVIGNITI:");
				System.out.println("----------------------------------------------------------------");
				int amout2 = scanner.nextInt();
				withdraw(amout2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------------------------------------------");
				System.out.println();
				System.out.println("----------------------------------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
			System.out.println("\n");
			break;
				
			default:
				System.out.println("*********************************************************************");
				break;
				
			}
		}while(option != 'E');
		
		System.out.println("Hvala ker ste uporabljali nase strotive");
	}
}
