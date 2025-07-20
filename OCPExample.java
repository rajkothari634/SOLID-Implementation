// ✅ OPEN/CLOSED PRINCIPLE (OCP)
// Classes should be open for extension, but closed for modification.

//// ❌ Bad Example: Every new discount type requires modifying this class.
class BadDiscountService {
    public double applyDiscount(String type, double amount) {
        if ("SEASONAL".equals(type)) {
            return amount * 0.9;
        } else if ("FESTIVAL".equals(type)) {
            return amount * 0.8;
        }
        return amount;
    }
}

//// ✅ Good Example: Use interface to allow adding new discounts without modifying logic.

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
