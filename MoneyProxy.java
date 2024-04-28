public class MoneyProxy implements MoneyOperations {
    private Money money;

    public MoneyProxy() {
        money = new Money();
    }

    public MoneyProxy(int initialMoney) {
        money = new Money(initialMoney);
    }

    @Override
    public int getMoney() {
        return money.getMoney();
    }

    @Override
    public void addMoney(int amount) {
        money.addMoney(amount);
    }

    @Override
    public void substractMoney(int amount) {
        money.substractMoney(amount);
    }

    @Override
    public boolean isBrokeOut() {
        return money.isBrokeOut();
    }
}