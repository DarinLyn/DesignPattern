package structuralpattern.decoratorpattern.demo2;

public class SkillR extends Skills {

    private String skillName;

    public SkillR(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        System.out.println("Learn skill R: " + skillName);
        super.learnSkills();
    }
}
