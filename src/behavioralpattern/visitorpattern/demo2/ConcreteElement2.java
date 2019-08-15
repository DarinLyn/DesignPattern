package behavioralpattern.visitorpattern.demo2;

public class ConcreteElement2 extends Element {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("this is element 2");
    }
}
