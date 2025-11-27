public class Working extends AbstractState<Juca>{
    public Working(Juca character){
        super(character);
    }

    public void enter() {
        System.out.println("Começando a trabalhar.");
    }

    public void execute(){
        System.out.println("Juca está trabalhando.");
        getCharacter().starve(2);
        getCharacter().exhausted(5);

        if (getCharacter().getFatigue() > 50) {
            getCharacter().setState(new Sleeping(getCharacter()));
        }

        else if (getCharacter().getHunger() > 10) {
            getCharacter().setState(new Eating(getCharacter()));
        }
    }
    public void leave(){
        System.out.println("Chega! Parei de trabalhar.");
    }
}
