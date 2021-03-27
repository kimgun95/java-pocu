import java.util.ArrayList;

public class CrowdFundingAccount {
    private int balance;

    private ArrayList<IFundingCallback> subscribers;

    public CrowdFundingAccount() {
        this.subscribers = new ArrayList<IFundingCallback>();
    }
    public void subscribe(IFundingCallback sub) {
        subscribers.add(sub);
    }
    public void support(String backer, int amount) {
        this.balance += amount;

        for (IFundingCallback sub : subscribers) {
            sub.onMoneyRaised(backer, amount);
        }
    }
    public void unsubscribe(IFundingCallback sub) {
        subscribers.remove(sub);
    }
}
