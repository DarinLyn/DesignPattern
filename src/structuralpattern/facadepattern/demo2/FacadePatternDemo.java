package structuralpattern.facadepattern.demo2;

public class FacadePatternDemo {
    public static void main(String[] args) {
        PCMaker pcMaker = new PCMaker();
        pcMaker.PCStart();
        System.out.println("--------------------------");
        pcMaker.PCShutdown();
    }
}
