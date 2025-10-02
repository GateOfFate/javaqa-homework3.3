public class CreditPaymentService {
    public int calculate(int creditInRub, int creditLoanInYears, double percentageRate) {
        double a = (1 + percentageRate);
        double b = creditLoanInYears;

        double monthlyPaymentInRub = creditInRub * ((percentageRate * Math.pow(a, b)) / (Math.pow(a, b) - 1));

        return (int)  monthlyPaymentInRub;


    }

}
