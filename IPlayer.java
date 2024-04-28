// Interface for Player and Decorator
interface IPlayer {
    int getTotalWalk();
    int tossDie(Die die);
    int getCurrentPosition();
    void setPosition(int position);
    void nextTurn();
    String getName();
    Money getMoney();
    int getID();
    void setBrokeOut(boolean brokeout);
    boolean isBrokeOut();
}