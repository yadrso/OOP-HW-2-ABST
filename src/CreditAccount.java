public class CreditAccount extends Account {
    private long limit;

    public CreditAccount(long limit) {
        this.limit = limit;
    }
    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance - amount >= limit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
