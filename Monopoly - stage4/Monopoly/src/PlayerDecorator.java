public class PlayerDecorator implements PlayerInterface{

  private PlayerInterface player;

  public PlayerDecorator(PlayerInterface player) {
      this.player = player;
  }

  public void nextTurn() {
  this.player.nextTurn();
}

  public int tossDie(Die die) {
return this.player.tossDie(die);
  }
}