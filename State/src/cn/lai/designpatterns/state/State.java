package cn.lai.designpatterns.state;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 14:05
 */
public interface State {
    //GumBallMachineContext context = null;
    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();
}
