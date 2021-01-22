public class Main {
    public static void main(String[] args) {
        CreditPaymentService service1 = new CreditPaymentService();
        double monthlyPayment1 = (int)service1.calculate(1_000_000, 1);
        System.out.println(monthlyPayment1);

        CreditPaymentService service2 = new CreditPaymentService();
        double monthlyPayment2 = (int)service2.calculate(1_000_000, 2);
        System.out.println(monthlyPayment2);

        CreditPaymentService service3 = new CreditPaymentService();
        double monthlyPayment3 = (int)service3.calculate(1_000_000, 3);
        System.out.println(monthlyPayment3);
    }
}
