package cn.lai.designpatterns.factory.abstractfactory;

public class GiveMeALaTiao {
    public static void main(String[] args) {
        //--------------卫龙专卖店
        LaTiao laTiao = new WeiLongLaTiao(new WeiLongFactory()).createLaTiao();
        LaTiao laTiao2 = new XianGeLaTiao(new XianGeFactory());


    }
}
