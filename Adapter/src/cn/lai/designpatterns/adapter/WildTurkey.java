package cn.lai.designpatterns.adapter;

/**
 * 野生火鸡,现在,想让这个火鸡伪装成鸭子类型
 */
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
