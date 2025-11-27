public class StateMachine<C> {
    private State<C> CurrentState;

    public void ChangeState(State<C> NewState) {
        if (CurrentState != null) {
            CurrentState.leave();
        }
        CurrentState = NewState;
        CurrentState.enter();
    }

    public void update() {
        if(CurrentState != null){
            CurrentState.execute();
        }
    }
}
