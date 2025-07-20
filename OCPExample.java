// Open/Closed Principle (OCP)

interface DiscountStrategy {
    double apply(double amount);
}

class SeasonalDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.9;
    }
}

class FestivalDiscount implements DiscountStrategy {
    public double apply(double amount) {
        return amount * 0.8;
    }
}

class DiscountService {
    public double applyDiscount(DiscountStrategy strategy, double amount) {
        return strategy.apply(amount);
    }
}