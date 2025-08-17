public class TestAccounts {
    public static void main(String[] args) {
        System.out.println("=== Тестирование системы счетов ===\n");
        
        // Создаем счета
        SimpleAccount simpleAccount = new SimpleAccount(1000);
        CreditAccount creditAccount = new CreditAccount(500, 1000);
        
        System.out.println("Начальные балансы:");
        System.out.println("SimpleAccount: " + simpleAccount.getBalance());
        System.out.println("CreditAccount: " + creditAccount.getBalance() + " (кредитный лимит: " + creditAccount.getCreditLimit() + ")\n");
        
        // Тестируем операции
        System.out.println("Пополнение SimpleAccount на 200: " + simpleAccount.add(200));
        System.out.println("Баланс SimpleAccount: " + simpleAccount.getBalance());
        
        System.out.println("Покупка с SimpleAccount на 300: " + simpleAccount.pay(300));
        System.out.println("Баланс SimpleAccount: " + simpleAccount.getBalance());
        
        System.out.println("Покупка с CreditAccount на 800: " + creditAccount.pay(800));
        System.out.println("Баланс CreditAccount: " + creditAccount.getBalance());
        
        System.out.println("Покупка с CreditAccount на 400: " + creditAccount.pay(400));
        System.out.println("Баланс CreditAccount: " + creditAccount.getBalance());
        
        System.out.println("Перевод 100 с SimpleAccount на CreditAccount: " + simpleAccount.transfer(creditAccount, 100));
        System.out.println("Баланс SimpleAccount: " + simpleAccount.getBalance());
        System.out.println("Баланс CreditAccount: " + creditAccount.getBalance());
    }
} 