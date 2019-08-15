package structuralpattern.proxypattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //loaded from disk
        image.display();
        System.out.println();
        image.display();
    }

}
