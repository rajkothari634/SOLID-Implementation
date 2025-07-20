// ✅ LISKOV SUBSTITUTION PRINCIPLE (LSP)
// Subtypes should be substitutable for their base types.

//// ❌ Bad Example: Ostrich breaks expectations because it can't fly.
class Bird {
    public void fly() {
        System.out.println("Bird flying");
    }
}

class Ostrich extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}

//// ✅ Good Example: Separate interfaces for flying and non-flying birds.

interface IBird {
    void eat();
}

interface IFlyingBird extends IBird {
    void fly();
}

class Sparrow implements IFlyingBird {
    public void eat() {
        System.out.println("Sparrow eating");
    }

    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Ostrich2 implements IBird {
    public void eat() {
        System.out.println("Ostrich eating");
    }
}
