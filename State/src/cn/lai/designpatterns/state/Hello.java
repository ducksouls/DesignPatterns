package cn.lai.designpatterns.state;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/6 9:52
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("hello");

//        GumballMachine gumballMachine = new GumballMachine(5);
//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
//        System.out.println("---------------");
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
//        System.out.println("---------------");
//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
//        System.out.println("----------------");
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//        System.out.println(gumballMachine);
//        System.out.println("----------------");
//
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
//        System.out.println("----------------");
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
//        System.out.println("----------------");


        System.out.println("#############################");
        GumBallMachineContext gumBallMachineContext = new GumBallMachineContext(5);
        gumBallMachineContext.insertQuarter();
        gumBallMachineContext.turnCrank();
        System.out.println("------------------");
        gumBallMachineContext.insertQuarter();
        gumBallMachineContext.insertQuarter();
        gumBallMachineContext.ejectQuarter();
        gumBallMachineContext.turnCrank();
        System.out.println("------------------");
        gumBallMachineContext.insertQuarter();
        gumBallMachineContext.insertQuarter();
        gumBallMachineContext.turnCrank();

        //gumBallMachineContext.turnCrank();
    }
}
