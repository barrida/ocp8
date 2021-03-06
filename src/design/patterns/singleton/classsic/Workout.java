package design.patterns.singleton.classsic;

/**
 * @author Suleyman Yildirim
 * <p>
 * Approach 1: Instantiate the singleton object directly in the definition of the instance reference
 */
public class Workout {

    private Workout() {
    }

    //Create private static final variable in the class, name it as instance
    private static final Workout instance = new Workout();

    //Access the instance via static method, name it as getInstance()
    public static Workout getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Workout w1 = Workout.getInstance();
        Workout w2 = Workout.getInstance();
        System.out.println(w1.equals(w2));
    }
}
