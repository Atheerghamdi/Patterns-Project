public class TaxSquareAdapter extends Square {
    private TaxSquare taxSquare;

    public TaxSquareAdapter(TaxSquare taxSquare) {
        super(taxSquare.getName());
        this.taxSquare = taxSquare;
    }

    @Override
    public void doAction(Player player, Board board) {
        // Additional behavior for TaxSquare
        int taxAmount = taxSquare.getTaxAmount();
        player.getMoney().substractMoney(taxAmount);
        System.out.println(player.getName() + " paid " + taxAmount + " in tax.");
    }
}