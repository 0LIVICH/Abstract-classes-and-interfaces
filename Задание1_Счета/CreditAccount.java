public class CreditAccount extends Account {
    private long creditLimit;
    
    public CreditAccount(long initialBalance, long creditLimit) {
        super(initialBalance);
        this.creditLimit = creditLimit;
    }
    
    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean pay(long amount) {
        if (amount > 0 && (balance - amount) >= -creditLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
    
    public long getCreditLimit() {
        return creditLimit;
    }
} 