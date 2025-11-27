public abstract class AbstractState<C> implements State<C> {
    protected C Character;

    public C getCharacter() {
        return Character;
    }

    public AbstractState(C character) {
        this.Character = character;
    }

    public void enter() {}
    public void leave() {}
}
