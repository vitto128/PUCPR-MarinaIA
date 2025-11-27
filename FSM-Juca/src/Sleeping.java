public class Sleeping extends AbstractState<Juca>{
    public Sleeping(Juca character){
        super(character);
    }

    public void enter() {
        System.out.println("Que sono, vou dormir...");
    }

    public void execute(){
        System.out.println("Juca está dormindo...");
        getCharacter().starve(1);
        getCharacter().sleep(10, 1);

        if (getCharacter().getFatigue() <= 0) {
            getCharacter().setFatigue(0);
            getCharacter().setState(new Working(getCharacter()));
        }
    }
    public void leave(){
        System.out.println("Acordei...");
    }
}
