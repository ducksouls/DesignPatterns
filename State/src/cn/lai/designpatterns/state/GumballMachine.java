package cn.lai.designpatterns.state;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 10:19
 */
public class GumballMachine {
    /**
     * 4个状态
     * 卖光,没钱,有钱,售卖
     */
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine( int count) {
        this.count = count;
        if (count > 0) {
            //count为0 state则为卖光
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if(state == HAS_QUARTER) {
            System.out.println("已经充钱");
        } else if(state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("您刚充值25元");
        }else if(state == SOLD_OUT) {
            System.out.println("卖光了,别充钱了");
        }else if(state == SOLD) {
            System.out.println("等下子就给你糖");
        }
    }

    public void ejectQuarter() {
        if(state== HAS_QUARTER){
            System.out.println("钱退给你");
            state = NO_QUARTER;
        } else if( state == NO_QUARTER ) {
            System.out.println("你没给钱,怎么能给你退钱");
        } else if (state == SOLD) {
            System.out.println("东西你都吃了还想退钱?");
        } else if (state == SOLD_OUT) {
            System.out.println("你不可能充钱的,所以别想退钱");
        }
    }

    public void turnCrank(){
        if(state== SOLD) {
            System.out.println("你已经拿到糖果了,还想再拿一个?");
        } else if (state == SOLD_OUT) {
            System.out.println("但是我们买完了啊");
        } else if (state == HAS_QUARTER) {
            System.out.println("你确实摇了...");
            state = SOLD;
            dispense();
        } else if( state == NO_QUARTER) {
            System.out.println("充钱再来");
        }
    }

    public void dispense() {
        if(state == SOLD ) {
            System.out.println("糖果马上就出来了...");
            count --;
            if (count == 0) {
                System.out.println("Ceeeeeeeeeeeb,卖光了哦");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.println("先去充钱吧");
        }else if (state == HAS_QUARTER) {
            System.out.println("充了钱就去拉摇杆");
        }else if (state == SOLD_OUT) {
            System.out.println("没糖了的");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
