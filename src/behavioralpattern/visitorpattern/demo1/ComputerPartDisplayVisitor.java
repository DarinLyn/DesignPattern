package behavioralpattern.visitorpattern.demo1;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(ComputerPart computerPart) {
        System.out.println("Displaying " + computerPart.getClass().getSimpleName());
    }
}
