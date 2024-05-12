public class FastRunnerPlayer extends PlayerDecorator {

    Player player;
    
    public FastRunnerPlayer(PlayerInterface decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void nextTurn() {
	// Move the player twice as fast
        this.player.nextTurn();
        this.player.nextTurn();
    }
}