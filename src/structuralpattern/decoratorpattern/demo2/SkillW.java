package structuralpattern.decoratorpattern.demo2;

public class SkillW extends Skills {

    private String skillName;

    public SkillW(Hero hero, String skillName){
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills(){
        System.out.println("Learn skill W: " + skillName);
        super.learnSkills();
    }
}
