import java.util.*;
public class Bank {
	private int accountno;
	private String personname, address; 
	private double balance; 
	public void InputInfo(String pname, String add, double bal, int acno) {
		personname=pname;
		address=add;
		balance=bal;
		accountno=acno;
	}
	public void showInfo() {
		System.out.println("Person Name = "+personname);
		System.out.println("Address = "+address);
		System.out.println("Account Number = "+accountno);
		System.out.println("Balance = "+balance);
	}
	public void deposit(double amt) {
		balance=balance+amt;
	}
 	public void withdraw(double amt) {
		if(balance>amt)
			balance=balance-amt;
		else
			System.out.println("Insufficant Balance");
	}
	public int getAccountNo() {
		return accountno;
	}
	public double getBalance() {
		return balance;
	}
	public String getAddress() {
		return address;
	}
	public void changeAddress(String add) {
		address=add;
	}
	public static void main(String[] args) {
		int size, i, f, acno=1000;
		char ans;
		String pname, add; 
		double amt;
		Scanner sr=new Scanner(System.in);
		System.out.print("Enter no. of new depositor: ");
		size=sr.nextInt();
		System.out.print("Press Any Key For Entering Depositor Information: ");
		ans=sr.next().charAt(0);
		Bank ob[]=new Bank[size];
	 	for (i=0; i<size; i++) {
			ob[i]=new Bank();
			System.out.print("Enter Name: ");
			pname=sr.next();
			System.out.print("Enter Address: ");
			add=sr.next();
			System.out.print("Enter Amount: ");
			amt=sr.nextDouble();
			acno=acno+1;
			ob[i].InputInfo(pname, add, amt, acno);
		}
		for(;;) {
			System.out.println("1 - Display information and balance of Depositor");
			System.out.println("2 - Deposit more amount in balance of any depositor");
			System.out.println("3 - Withdraw some amount from balance deposited");
			System.out.println("4 - Change address of depositor");
			System.out.print("Enter your choice: ");
			int ch=sr.nextInt();
			switch(ch) {
				case 1:
					f=0;
					System.out.print("Enter Account No.: ");
					acno=sr.nextInt();
					for (i=0; i<size; i++) {
						if(acno==ob[i].getAccountNo()) {
							ob[i].showInfo();
							f=1;
							break;
						}
					}
					if(f==0)
						System.out.println("Invalid Account Number");
					break;
				case 2:
					f=0;
					System.out.print("Enter Account No.: ");
					acno=sr.nextInt();
					for (i=0; i<size; i++) {
						if(acno==ob[i].getAccountNo()) {
							System.out.println("Enter amount: ");
							amt=sr.nextDouble();
							ob[i].deposit(amt);
							System.out.println("Updated Amount = "+ob[i].getBalance());
							f=1;
							break;
						}
					}
					if(f==0)
						System.out.println("Invalid Account Number");
					break;
				case 3:
					f=0;
					System.out.println("Enter Account No.: ");
					acno=sr.nextInt();
					for (i=0; i<size; i++) {
						if(acno==ob[i].getAccountNo()) {
							System.out.println("Enter amount: ");
							amt=sr.nextDouble();
							ob[i].withdraw(amt);
							System.out.println("Updated Amount = "+ob[i].getBalance());
							f=1;
							break;
						}
					}
					if(f==0)
						System.out.println("Invalid AcountNo ");
					break; 
				case 4:
					f=0;
					System.out.println("Enter Account No.: ");
					acno=sr.nextInt();
					for (i=0; i<size; i++) {
						if(acno==ob[i].getAccountNo()) {
							System.out.println("Enter New Address: ");
							add=sr.nextLine();
							ob[i].changeAddress(add);
							System.out.println("Updated Address: "+ob[i].getAddress());
							f=1;
							break;
						}
					}
					if(f==0)
						System.out.println("Invalid AcountNo ");
					break; 
			}
			System.out.print("Do you want to more transactions (Y/N): ");
			ans=sr.next().charAt(0);
			if(ans=='N' || ans=='n')
				break;
		}
	}
}