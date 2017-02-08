package SimUDuck.Model;

import SimUDuck.Fly.FlyNoWay;
import SimUDuck.Quack.Sneak;

/**
 * Created by Anil Lama on 2/7/2017.
 */
public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Sneak();
    }

    public void display(){
        System.out.println("I'm THE RUBBER DUCK");
    }
}
