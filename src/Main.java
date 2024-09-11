public class Main {
    public static void main(String[] args) {
        Account simpleAccount = new SimpleAccount();
        Account creditAccount = new CreditAccount(-400_000);

        simpleAccount.add(300_000);
        simpleAccount.pay(200_000);

        long balance1 = simpleAccount.getBalance();
        simpleAccount.transfer(creditAccount, 300_000);
        long  balance2 = creditAccount.getBalance();


        System.out.println(balance1);
        System.out.println(balance2);
        creditAccount.add(500_000);

        creditAccount.pay(300_000);
        creditAccount.transfer(simpleAccount, 300_000);

        System.out.println(simpleAccount.getBalance());
        System.out.println(creditAccount.getBalance());
    }
}