public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int oneCalculate = service.calculate(1_000_000, 1);
        System.out.println(oneCalculate);

        System.out.println();
        int twoCalculate = service.calculate(1_000_000, 2);
        System.out.println(twoCalculate);

        System.out.println();
        int threeCalculate = service.calculate(1_000_000, 3);
        System.out.println(threeCalculate);
    }
}
