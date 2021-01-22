public class CreditPaymentService {
    public double calculate (long creditAmount, int years) {
        double interestRate = 9.99;
        double interestRateMonth = interestRate / 12 / 100;
        int loanDurationMonth = years * 12;
        double monthlyPayment = creditAmount*(Math.pow((1+interestRateMonth),loanDurationMonth)*interestRateMonth)/((Math.pow((1+interestRateMonth),loanDurationMonth))-1);
        return monthlyPayment;
    }
}
