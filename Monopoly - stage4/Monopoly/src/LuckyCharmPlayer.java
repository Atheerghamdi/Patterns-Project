public class LuckyCharmPlayer extends PlayerDecorator {

    public LuckyCharmPlayer(PlayerInterface decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public int tossDie(Die die) {
        // Additional behavior for "Lucky Charm" ability
        // Add +1 to the rolled die value
        int roll = super.tossDie(die);
        return roll + 1;
    }
}