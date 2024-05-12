public class FixedRentStrategy implements RentStrategy {

    private int fixedRentAmount;

    public FixedRentStrategy(int fixedRentAmount) {

        this.fixedRentAmount = fixedRentAmount;
    }

    public int calculateRent(int baseRent) {

        return fixedRentAmount;
    }
}