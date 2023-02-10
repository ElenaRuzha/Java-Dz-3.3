public class CreditPaymentService {
    public int calculate(int amount, int date) {
        int month = date * 12;
        double monthStavka = 9.99 / 12 / 100;
        double koeff = monthStavka * Math.pow(1 + monthStavka, month) / (Math.pow(1 + monthStavka, month) - 1);
        double annuit = koeff * amount;
        int result = (int) annuit;
        return result;
    }
}
