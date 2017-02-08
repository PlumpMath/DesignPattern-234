package SimUDuck;

import SimUDuck.Model.Duck;
import SimUDuck.Fly.FlyRocketPowered;
import SimUDuck.Model.RubberDuck;

/**
 * Created by Anil Lama on 2/7/2017.
 */
public class SimUDuckMain {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();
        System.out.println("Found a rocket!!");
        duck.setFlyBehaviour(new FlyRocketPowered());
        duck.performFly();
    }
}
