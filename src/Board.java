import java.util.Random;

public class Board {
	private int currentTurn = 0;
	private int totalPlayer = 0;
	private Player[] players;
	private Square[] squares = new Square[40];
	private String[] names = new String[] { "House", "Villa", "Town", "City", "Peace", "Village", "Jade", "Soi 4", "White", "Dark" };

	public Board(int totalPlayer) {
		players = new Player[totalPlayer];
		this.totalPlayer = totalPlayer;
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(i, "Player " + (i + 1));
		}
		Random rand = new Random();
		for (int i = 0; i < squares.length; i++) {
			if (i == 0) {
				squares[i] = SquareFactory.getSquare("Go", "GO", 0);
			} else if (i == 9) {
				squares[i] = SquareFactory.getSquare("Jail", "Jail", 0);
			} else if (i == 19) {
				squares[i] = SquareFactory.getSquare("Vacation", "Vacation", 0);
			} else if (i == 29) {
				squares[i] = SquareFactory.getSquare("GoToJail", "Go to Jail", 0);
			} else {
				squares[i] = SquareFactory.getSquare("House", names[rand.nextInt(names.length)] + " " + names[rand.nextInt(names.length)], 400 + rand.nextInt(300));
			}
		}
	}
	public Square movePlayer(Player player, int face) {
		return movePlayer(player, face, true);
	}

	public Square movePlayer(Player player, int face, boolean count) {
		if(player.isBrokeOut()){ return squares[player.getCurrentPosition()]; }
		int newPosition = normalizePosition(player.getCurrentPosition() + face);
		player.setPosition(newPosition);
		Util.print(player, player.getName() + " goes to " + squares[player.getCurrentPosition()].getName());
		squares[newPosition].doAction(player, this);
		if(player.getMoney().isBrokeOut()){
			Util.print(player, player.getName() + " has been broke out!");
			player.setBrokeOut(true);
		}else{
			if(count){
				player.nextTurn();
			}
		}
		return squares[newPosition];
	}

	public boolean hasWinner() {
		int ingame = 0;
		for(Player player:players){
			if(!player.isBrokeOut()){
				ingame++;
			}
		}
		return ingame <= 1;
	}

	public Player getWinner() {
		if(!hasWinner()){ return null; }
		for(Player player:players){
			if(!player.isBrokeOut()){ return player; }
		}
		return null;
	}

	public Player getMaxMoneyPlayer() {
		Player maxplayer = null;
		for(Player player:players){
			if(maxplayer == null || maxplayer.getMoney().getMoney() < player.getMoney().getMoney()){
				maxplayer = player;
			}
		}
		return maxplayer;
	}

	public int normalizePosition(int position) {
		return position % squares.length;
	}

	public Player getCurrentPlayer() {
		return players[currentTurn];
	}

	public Player[] getPlayers() {
		return players;
	}

	public void nextTurn() {
		if(++currentTurn >= players.length){
			currentTurn = 0;
		}
	}

	public Player getPlayer(int id) {
		return players[id];
	}

	public int getTotalSquare() {
		return squares.length;
	}
}
