package cn.lai.designpatterns.adapter;

/**
 * 鸭子接口
 */
public interface Duck {
    void quack();
    void fly();
}

/**
 * 火鸡接口
 */
interface Turkey{
    void gobble();
    void fly();
}
