package cn.lai.designpatterns.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("哦，我的老伙计");
    }

    @Override
    public void fly() {
        System.out.println("火鸡在飞？？？");
    }
}
