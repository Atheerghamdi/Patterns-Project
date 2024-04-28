// Abstract Decorator class
abstract class PlayerDecorator implements IPlayer {
    protected IPlayer decoratedPlayer;

    public PlayerDecorator(IPlayer decoratedPlayer) {
        this.decoratedPlayer = decoratedPlayer;
    }

    public int getTotalWalk() {
        return decoratedPlayer.getTotalWalk();
    }

    public int tossDie(Die die) {
        return decoratedPlayer.tossDie(die);
    }

    public int getCurrentPosition() {
        return decoratedPlayer.getCurrentPosition();
    }

    public void setPosition(int position) {
        decoratedPlayer.setPosition(position);
    }

    public void nextTurn() {
        decoratedPlayer.nextTurn();
    }

    public String getName() {
        return decoratedPlayer.getName();
    }

    public Money getMoney() {
        return decoratedPlayer.getMoney();
    }

    public int getID() {
        return decoratedPlayer.getID();
    }

    public void setBrokeOut(boolean brokeout) {
        decoratedPlayer.setBrokeOut(brokeout);
    }

    public boolean isBrokeOut() {
        return decoratedPlayer.isBrokeOut();
    }
}