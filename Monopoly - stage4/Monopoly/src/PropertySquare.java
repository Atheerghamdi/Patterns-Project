public class PropertySquare extends Square {
    private int baseRent;
    private RentStrategy rentStrategy;

    public PropertySquare(String name, int baseRent, RentStrategy rentStrategy) {
        super(name);
        this.baseRent = baseRent;
        this.rentStrategy = rentStrategy;
    }

    public int getBaseRent() {
        return baseRent;
    }

    public int calculateRent() {
        return rentStrategy.calculateRent(baseRent);
    }

    @Override
    public void doAction(Player player, Board board) {
        Util.print(player, player.getName() + " has been On Property and lost money");
        player.getMoney().substractMoney(this.calculateRent());
    }
}