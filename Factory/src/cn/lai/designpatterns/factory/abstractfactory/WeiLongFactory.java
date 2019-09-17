package cn.lai.designpatterns.factory.abstractfactory;

public class WeiLongFactory implements LaTiaoAbstractFactory {
    @Override
    public Chili createChili() {
        return new WeiLongChili();
    }

    @Override
    public Oil createOil() {
        return null;
    }

    @Override
    public Salt createSalt() {
        return null;
    }
}
