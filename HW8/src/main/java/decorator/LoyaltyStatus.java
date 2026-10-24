package decorator;

public class LoyaltyStatus {
    private String statusTier;

    public LoyaltyStatus(String statusTier) {
        this.statusTier = statusTier.toUpperCase();
    }

    public double applyDiscount(double currentTotal) {
        return switch (statusTier) {
            case "GOLD" -> currentTotal * 0.80;
            case "SILVER" -> currentTotal * 0.90;
            default -> currentTotal;
        };
    }
}