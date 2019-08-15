package behavioralpattern.visitorpattern.demo1;

import java.util.Arrays;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        Arrays.asList(parts).stream().forEach(data -> data.accept(computerPartVisitor));
        computerPartVisitor.visit(this);
    }
}
