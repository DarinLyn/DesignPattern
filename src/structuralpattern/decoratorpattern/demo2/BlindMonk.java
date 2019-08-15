package structuralpattern.decoratorpattern.demo2;

public class BlindMonk implements Hero{

    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + " learned a new skill");
    }
}
