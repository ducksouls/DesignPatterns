package cn.lai.designpatterns.factory.abstractfactory;

public class XianGeLaTiao implements LaTiao {

    private LaTiaoAbstractFactory lt = null;



    public XianGeLaTiao(LaTiaoAbstractFactory lt) {
        this.lt = lt;
    }

    @Override
    public void addChili() {
        Chili chili = this.lt.createChili();
        System.out.println("贤哥辣条---香香辣辣的辣条你吃过没(5毛一条)");
    }

    @Override
    public void addOil() {

    }

    @Override
    public void addSalt() {

    }
}
