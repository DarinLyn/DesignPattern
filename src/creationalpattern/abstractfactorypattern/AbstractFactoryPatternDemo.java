package creationalpattern.abstractfactorypattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        /* shape */
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        /* color */
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color red = colorFactory.getColor("red");
        red.fill();

        Color blue = colorFactory.getColor("blue");
        red.fill();

        Color green = colorFactory.getColor("green");
        green.fill();
    }
}
