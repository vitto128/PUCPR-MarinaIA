public interface State<C> {
    void enter();
    void execute();
    void leave();
}
