package cn.lai.designpatterns.adapter;

/**
 * 1. 适配器继承（实现）需要目标接口（target）
 * 2. 获得初始组件的引用（adptee），，，
 * 3. 转换请求（translate）
 * ====>效果是初始组件使用起来就像调用被适配的类一般
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        System.out.println("傻了吧，我会飞！！！");
        turkey.fly();
    }
}
