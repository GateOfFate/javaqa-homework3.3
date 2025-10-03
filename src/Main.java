//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
         int monthlyPaymentOne = service.calculate(100_000,12, 9.9 );
        System.out.println(" Ежемесячный платёж: " + monthlyPaymentOne);
        int monthlyPaymentTwo = service.calculate(150_000,24, 9.9 );
        System.out.println(" Ежемесячный платёж: " + monthlyPaymentTwo);
        int monthlyPaymentThree = service.calculate(200_000,36, 9.9 );
        System.out.println(" Ежемесячный платёж: " + monthlyPaymentThree);
        }
    }
