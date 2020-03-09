package cn.lai.designpatterns.state;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 14:09
 */
public class SoldOutState implements State {
    GumBallMachineContext context;

    public SoldOutState(GumBallMachineContext context) {
        this.context = context;
    }

    @Override
    public void insertQuarter() {
        System.out.println("别充钱了...没有货了...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你钱都充不了...怎么可能给你退钱...");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("东西都没了,你拉摇杆也没用啊");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("请回吧...没有糖吃的...");
    }
}
