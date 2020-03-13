package cn.lai.designpatterns.templatemethod.cook;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 16:50
 */
public class TestDriver {
    public static void main(String[] args) {
        DoDishesTemplate test = new EggsWithTomato();
        test.doDishes();

        test = new BraisedPork();
        test.doDishes();

    }
}
