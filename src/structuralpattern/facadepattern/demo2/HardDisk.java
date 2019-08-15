package structuralpattern.facadepattern.demo2;

public class HardDisk extends Hardware {
    @Override
    void start() {
        System.out.println("HardDisk start");
    }

    @Override
    void shutdown() {
        System.out.println("HardDisk shutdown");
    }
}
