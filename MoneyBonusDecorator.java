class MoneyBonusDecorator extends PlayerDecorator {
    private int bonusAmount;

    public MoneyBonusDecorator(IPlayer decoratedPlayer, int bonusAmount) {
        super(decoratedPlayer);
        this.bonusAmount = bonusAmount;
    }

    @Override
    public void nextTurn() {
        super.nextTurn();
        Money money = getMoney();
        money.addMoney(bonusAmount); // Assuming Money class has method addAmount(int amount) to increase money
        System.out.println(getName() + " received a bonus of " + bonusAmount + " money units.");
    }
}