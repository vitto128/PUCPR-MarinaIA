public class Eating extends AbstractState<Juca>{
    public Eating(Juca character){
        super(character);
    }

    public void enter() {
        System.out.println("Vou bater um rango!");
    }

    public void execute(){
        System.out.println("Juca está comendo!");
        getCharacter().eat(5);

        if (getCharacter().getHunger() <= 0) {
            getCharacter().setHunger(0);
            getCharacter().setState(new Working(getCharacter()));
        }

    }
    public void leave(){
        System.out.println("Pronto, estou satisfeito...");
    }
}
