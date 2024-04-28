public interface MoneyOperations {
    int getMoney();
    void addMoney(int amount);
    void substractMoney(int amount);
    boolean isBrokeOut();
}