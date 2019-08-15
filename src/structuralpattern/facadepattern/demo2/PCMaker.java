package structuralpattern.facadepattern.demo2;

public class PCMaker {
    private Hardware cpu;
    private Hardware memory;
    private Hardware hardDisk;

    public PCMaker() {
        cpu = new CPU();
        memory = new Memory();
        hardDisk = new HardDisk();
    }

    public void PCStart(){
        System.out.println("Starting PC...");
        cpu.start();
        memory.start();
        hardDisk.start();
    }

    public void PCShutdown(){
        System.out.println("Shutting down PC...");
        cpu.shutdown();
        memory.shutdown();
        hardDisk.shutdown();
    }
}
