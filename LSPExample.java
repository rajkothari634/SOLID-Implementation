// Liskov Substitution Principle (LSP)

interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void eat() {
        System.out.println("Sparrow eating");
    }
    public void fly() {
        System.out.println("Sparrow flying");
    }
}

class Ostrich implements Bird {
    public void eat() {
        System.out.println("Ostrich eating");
    }
}