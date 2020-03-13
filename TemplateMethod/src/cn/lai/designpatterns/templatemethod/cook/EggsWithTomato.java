package cn.lai.designpatterns.templatemethod.cook;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 16:41
 */
public class EggsWithTomato extends DoDishesTemplate {


    @Override
    protected void cook() {
        System.out.println("1.先炒蛋");
        System.out.println("2.放入西红柿");
        System.out.println("3.放调料");
    }

    @Override
    protected void cutUp() {
        System.out.println("切西红柿");
    }


}
