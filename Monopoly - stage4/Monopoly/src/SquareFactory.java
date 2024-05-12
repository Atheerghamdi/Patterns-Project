public class SquareFactory {

    public static Square getSquare(String type, String name, int price) {
        switch (type) {
            case "Go":
                return new GoSquare(name);
            case "Jail":
                return new JailSquare(name);
            case "Vacation":
                return new VacationSquare(name);
            case "GoToJail":
                return new GoToJailSquare(name);
            case "House":
                return new HouseSquare(name, price);
            default:
                throw new IllegalArgumentException("Invalid square type: " + type);
        }
    }
}