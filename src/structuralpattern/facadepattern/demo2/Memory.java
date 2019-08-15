package structuralpattern.facadepattern.demo2;

public class Memory extends Hardware {
    @Override
    void start() {
        System.out.println("Memory start");
    }

    @Override
    void shutdown() {
        System.out.println("Memory shutdown");
    }
}
