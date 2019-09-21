package cn.lai.designpatterns.factory.abstractfactory;


public class WeiLongLaTiao implements LaTiao {

    LaTiaoAbstractFactory lt = null;
    private Chili c = null;
    private Oil o = null;
    private Salt s = null;

    public WeiLongLaTiao(LaTiaoAbstractFactory lt) {
        this.lt = lt;
    }

    public LaTiao createLaTiao() {
        addChili();
        addOil();
        addSalt();
        return this;
    }

    @Override
    public void addChili() {
        this.c = this.lt.createChili();
        System.out.println("给辣条加上卫龙的辣椒---");
    }

    @Override
    public void addOil() {
        System.out.println("虽然没放油，但我还是卫龙辣条");
    }

    @Override
    public void addSalt() {
        System.out.println("请试试不加盐的卫龙辣条");
    }
}
