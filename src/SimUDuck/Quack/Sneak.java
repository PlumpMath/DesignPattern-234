package SimUDuck.Quack;

/**
 * Created by Anil Lama on 2/7/2017.
 */
public class Sneak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I don't quack, I sneak.");
    }
}
