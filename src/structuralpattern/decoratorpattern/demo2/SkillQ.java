package structuralpattern.decoratorpattern.demo2;

public class SkillQ extends Skills {
    private String skillName;

    public SkillQ(Hero hero, String skillName){
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills(){
        System.out.println("Learn skill q: " + skillName);
        super.learnSkills();
    }
}
