package structuralpattern.decoratorpattern.demo2;

public class SkillE extends Skills {

    private String skillName;

    public SkillE(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("Learn skill E: " + skillName);
        super.learnSkills();
    }
}
