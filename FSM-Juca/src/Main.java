//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    enum states { working, eating, sleeping }
    static states CurrentState = states.working;
    static int hunger = 0;
    static int fatigue = 0;

    public static void JucaState() {
        while (true) {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            switch (CurrentState) {
                case working:
                    System.out.println("Estou trabalhando.");
                    hunger += 5;
                    fatigue += 2;
                     break;
                case eating:
                    System.out.println("Estou comendo!");
                    hunger -= 5;
                    if (hunger <= 0){
                        System.out.println("Estou satisfeito...!");
                        hunger = 0;
                        CurrentState = states.working;
                    }
                    break;

                case sleeping:
                    System.out.println("Estou dormindo...");
                    hunger += 1;
                    fatigue -= 10;
                    if (fatigue <= 0){
                        System.out.println("Tá na hora de trabalhar.");
                        fatigue = 0;
                        CurrentState = states.working;
                    }
                    break;

            }
            System.out.println("fome: " + hunger + " fadiga: " + fatigue);
            if (fatigue > 50) {
                System.out.println("Nossa que soninho...");
                CurrentState = states.sleeping;
            }
            if (hunger > 10 && CurrentState != states.sleeping) {
                System.out.println("Bateu uma fome hein?");
                CurrentState = states.eating;
            }
        }
    }
    public static void main(String[] args) {
        JucaState();

    }
}