public class Juca {
    private int hunger = 0;
    private int fatigue = 0;
    private StateMachine<Juca> SM;

    public Juca() {
        SM = new StateMachine<>();
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getHunger(){
        return hunger;
    }

    public void update(){
        SM.update();
        System.out.println("fome: " + hunger + " fadiga: " + fatigue);
    }

    public void setState(State<Juca> NewState){
        SM.ChangeState(NewState);
    }
    public void sleep(int sono, int fome){
        fatigue -= sono;
        hunger += fome;

    }
    public void eat(int fome){
        hunger -= fome;
    }
    public void starve(int fome){
        hunger += fome;
    }
    public void exhausted(int sono){
        fatigue += sono;
    }
    public void setHunger(int fome){
        hunger = fome;
    }
    public void setFatigue(int sono) {
        fatigue = sono;
    }
}
