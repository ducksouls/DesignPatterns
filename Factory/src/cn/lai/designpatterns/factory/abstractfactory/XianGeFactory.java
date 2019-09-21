package cn.lai.designpatterns.factory.abstractfactory;

public class XianGeFactory implements LaTiaoAbstractFactory {
    @Override
    public Chili createChili() {
        return new XianGeChili();
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
