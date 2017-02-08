package SimUDuck.Model;

import SimUDuck.Fly.FlyWithWings;
import SimUDuck.Quack.QuackQuack;

/**
 * Created by Anil Lama on 2/7/2017.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new QuackQuack();
    }

    public void display(){
        System.out.println("I'm the Red Head.");
    }
}
