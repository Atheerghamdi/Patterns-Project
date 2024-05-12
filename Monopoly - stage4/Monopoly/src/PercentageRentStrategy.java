public class PercentageRentStrategy implements RentStrategy {
    private double percentage;

    public PercentageRentStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public int calculateRent(int baseRent) {
        return (int) (baseRent * percentage);
    }
}