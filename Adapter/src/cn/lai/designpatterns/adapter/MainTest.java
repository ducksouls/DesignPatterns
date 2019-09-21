package cn.lai.designpatterns.adapter;

public class MainTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();
        mallardDuck.fly();
        mallardDuck.quack();
    }

}
