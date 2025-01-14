
public class Loan {
		private double annualInterestRate;
		private int numberOfYears;
		private int loanAmount;
		private java.util.Date loanDate;
		
		public Loan() {
			this(2.5, 1, 1000);
		}
		public Loan(double annualInteresRate, int numberOfYears, int loanAmount) {
			this.annualInterestRate = annualInteresRate;
			
		}
}
