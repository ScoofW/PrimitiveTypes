public class Every100 {
    public static void main(String[] args) {
        int balance = 100; //баланс
        int sum = 20000;  //сумма пополнения
        if (sum > 1000) {
            int bonus = sum / 100;

            System.out.println("Итоговый бонус: " + bonus);

            int total = balance + sum + bonus;

            System.out.println("Итоговый баланс: " + total);
        } else {
            int total = balance + sum;

            System.out.println("Итоговый баланс: " + total);
        }
    }

}
