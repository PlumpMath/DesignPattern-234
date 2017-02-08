package SimUDuck.Model;

import SimUDuck.Fly.FlyBehaviour;
import SimUDuck.Quack.QuackBehaviour;

/**
 * Created by Anil Lama on 2/7/2017.
 */
public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("Water's cold");
    }
    public void eat(){
        System.out.println("Yummy");
    }

    public void display(){
        System.out.println("Hey!! This is a duck.");
    }
}
