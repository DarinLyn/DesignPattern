package behavioralpattern.visitorpattern.demo2;

public abstract class Element {
    public abstract void accept(IVisitor visitor);
    public abstract void doSomething();
}
