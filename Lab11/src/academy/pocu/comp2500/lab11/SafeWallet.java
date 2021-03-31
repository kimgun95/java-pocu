package academy.pocu.comp2500.lab11;

import academy.pocu.comp2500.lab11.pocu.User;
import academy.pocu.comp2500.lab11.pocu.Wallet;

public final class SafeWallet extends Wallet {
    public SafeWallet(final User user) throws IllegalAccessException {
        super(user);
    }
    @Override
    public boolean deposit(final int amount) {
        if (amount <= 0) {
            return false;
        }

        try {
            super.amount += amount;
            if (super.amount <= 0) {
                throw new OverflowException("amount is overflow!!!");
            }
        } catch (Exception e) {

        }
        return true;
    }
}
