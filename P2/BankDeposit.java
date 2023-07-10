import java.util.Scanner;
public class BankDeposit {
    public static void main(String[] args) {
        int choice=0;
        double maturityAmount=0;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Type 1: Term Deposit"); 
        System.out.println("Type 2: Recurring Deposit"); 
        System.out.print("Enter your choice: ");     
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter Principal: ");
                double P1=sc.nextDouble(); 
                System.out.print("Enter Rate of Interest: "); 
                double r1=sc.nextDouble(); 
                System.out.print("Enter Time (in years): "); 
                double n1=sc.nextDouble();
                maturityAmount=P1*Math.pow(1+r1/100.0, n1);
                System.out.println("Maturity Amount = "+maturityAmount);
                break; 
            case 2:
                System.out.print("Enter Monthly Installment: "); 
                double P2=sc.nextDouble(); 
                System.out.print("Enter Rate of Interest: "); 
                double r2=sc.nextDouble(); 
                System.out.print("Enter Period (in months): "); 
                double n2=sc.nextDouble();
                maturityAmount=P2*n2+P2*(n2*(n2+1)/2.0)*(r2/100.0)*(1.0/12); 
                System.out.println("Maturity Amount = "+maturityAmount); 
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
