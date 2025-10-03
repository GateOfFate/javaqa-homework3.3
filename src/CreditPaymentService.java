public class CreditPaymentService {
    public int calculate(int creditInRub, int creditLoanInMonths, double percentageRate) {
        double percentInMonth = percentageRate / 12 / 100;
        double a = (1 + percentInMonth);
        double b = creditLoanInMonths;

        double monthlyPaymentInRub = creditInRub * ((percentInMonth * Math.pow(a, b)) / (Math.pow(a, b) - 1));

        return (int) monthlyPaymentInRub;


    }

}
