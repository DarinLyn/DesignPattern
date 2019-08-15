package structuralpattern.facadepattern.demo2;

public class CPU extends Hardware {
    @Override
    void start() {
        System.out.println("CPU start");
    }

    @Override
    void shutdown() {
        System.out.println("CPU shutdown");
    }
}
