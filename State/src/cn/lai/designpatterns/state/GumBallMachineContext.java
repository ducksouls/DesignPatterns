package cn.lai.designpatterns.state;

/**
 * @Description: 持有一些内部状态,状态的切换最终是通过此类完成
 * @author: ZNXM-007
 * @date 2020/3/6 14:03
 */
public class GumBallMachineContext {
    //5种状态
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State winnerState;



    private State state = soldOutState;
    private int count = 0;

    public GumBallMachineContext(int count) {
        this.count = count;
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        winnerState = new WinnerState(this);
        if (count > 0 ) {
            state = noQuarterState;
        }
    }


    void insertQuarter(){
        this.state.insertQuarter();
    }

    void ejectQuarter(){
        this.state.ejectQuarter();
    }

    void turnCrank() {
        boolean b = this.state.turnCrank();
        if (b) {
            this.state.dispense();
        }
    }

    void releaseBall() {
        // System.out.println("糖马上就出来了等一秒钟");
        if ( this.count > 0 ) {
            this.count--;
        }
        System.out.println("糖出来了一个");
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }
}
