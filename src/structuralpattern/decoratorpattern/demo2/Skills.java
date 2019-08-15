package structuralpattern.decoratorpattern.demo2;

public class Skills implements Hero {
    private Hero hero;

    public Skills(Hero hero){
        this.hero = hero;
    }

    @Override
    public void learnSkills(){
        if(hero != null){
            hero.learnSkills();
        }
    }
}
