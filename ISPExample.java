// ✅ INTERFACE SEGREGATION PRINCIPLE (ISP)
// No client should be forced to depend on methods it does not use.

//// ❌ Bad Example: Robot forced to implement eat() even if it doesn’t need it.
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {
        System.out.println("Robot working");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}

//// ✅ Good Example: Separate interfaces for separate responsibilities.

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Human working");
    }

    public void eat() {
        System.out.println("Human eating");
    }
}

class Robot2 implements Workable {
    public void work() {
        System.out.println("Robot working");
    }
}
