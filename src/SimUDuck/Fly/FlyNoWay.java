package SimUDuck.Fly;

/**
 * Created by Anil Lama on 2/7/2017.
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying? Are you kidding me?");
    }
}
