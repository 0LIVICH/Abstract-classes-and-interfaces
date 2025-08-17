public abstract class Account {
    protected long balance;
    
    public Account(long initialBalance) {
        this.balance = initialBalance;
    }
    
    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);
    
    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                // Если перевод не удался, возвращаем деньги обратно
                this.add(amount);
                return false;
            }
        }
        return false;
    }
    
    public long getBalance() {
        return balance;
    }
} 