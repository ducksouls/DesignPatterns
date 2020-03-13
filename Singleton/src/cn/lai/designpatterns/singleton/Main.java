package cn.lai.designpatterns.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 8:43
 */
public class Main {
    static CountDownLatch countDownLatch = new CountDownLatch(10000);
    public static void main(String[] args) throws InterruptedException {

        long l = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++ ){
            Thread thread = new Person();
            thread.start();
        }
        countDownLatch.await();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}
class Person extends Thread{
    @Override
    public void run(){
        /**
         * 饿汉
         * 647 643 928 641 657 668  653 644
         */
//        EagerlySingleton instance = EagerlySingleton.getInstance();
        /**
         * 懒汉线程安全,
         * 651 649 882 906  642 661  655 653
         */

//        SynchronizedSingleton instance = SynchronizedSingleton.getInstance();
        /**
         * 双重锁
         *645 646 634 639 648 649 655  650 645
         */
        DoubleCheckedLock instance = DoubleCheckedLock.getInstance();
        /*System.out.println(instance);*/
//        System.out.println(instance.hashCode());
        Main.countDownLatch.countDown();
    }
}
