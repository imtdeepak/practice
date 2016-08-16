package threads;

/**
 * Created by Deepak on 7/28/16.
 */
public class DeadLock {

    class Account {
        double balance;
        int id;

        void withdraw(double amount) {
            balance -= amount;
        }

        void deposit(double amount) {
            balance += amount;
        }

        void transfer(Account from, Account to, double amount) {
            synchronized (from) {
                synchronized (to) {
                    from.withdraw(amount);
                    to.deposit(amount);

                }
            }
        }

    }
}
