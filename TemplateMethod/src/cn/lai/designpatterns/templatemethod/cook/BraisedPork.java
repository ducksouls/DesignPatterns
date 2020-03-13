package cn.lai.designpatterns.templatemethod.cook;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 16:46
 */
public class BraisedPork extends DoDishesTemplate{




    @Override
    protected void cook() {
        System.out.println("我不会做,所以...");
        System.out.println("妈,我想吃红烧肉");
    }

    @Override
    protected void cutUp() {
        System.out.println("切肉");
    }


}
