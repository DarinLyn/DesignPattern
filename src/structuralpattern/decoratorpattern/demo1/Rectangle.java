package structuralpattern.decoratorpattern.demo1;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Show: Rectangle");
    }
}
