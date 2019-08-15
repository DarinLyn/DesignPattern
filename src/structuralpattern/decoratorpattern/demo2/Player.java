package structuralpattern.decoratorpattern.demo2;

public class Player {
    public static void main(String[] args) {
        Hero hero = new BlindMonk("Lee Sin");

        Skills skills = new Skills(hero);
        Skills r = new SkillR(skills, "Dragon rage!");
        Skills e = new SkillE(r, "Tempest");
        Skills w = new SkillW(e, "Safeguard");
        Skills q = new SkillQ(w, "Sonic wave");

        q.learnSkills();
    }
}
