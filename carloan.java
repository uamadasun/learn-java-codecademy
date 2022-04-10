//This program calculates how much a car loan customer will be paying every month
public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    //check to see if the customer is requesting a valid loan
    if (loanLength <= 0 || interestRate <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan) {
      System.out.println("The care can be paid in full.");
    } else { //the loan is valid
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance*interestRate)/100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }


	

	}
}
