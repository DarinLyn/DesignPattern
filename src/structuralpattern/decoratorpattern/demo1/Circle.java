package structuralpattern.decoratorpattern.demo1;

public class Circle implements Shape {

    @Override
    public void draw(){
        System.out.println("Shape: Circle");
    }
}