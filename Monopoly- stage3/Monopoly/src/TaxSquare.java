public class TaxSquare {
    private String name;
    private int taxAmount;

    public TaxSquare(String name, int taxAmount) {
        this.name = name;
        this.taxAmount = taxAmount;
    }

    public String getName() {
        return name;
    }

    public int getTaxAmount() {
        return taxAmount;
    }
}