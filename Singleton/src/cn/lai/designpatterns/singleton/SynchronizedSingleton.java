package cn.lai.designpatterns.singleton;

/**
 * @Description:懒汉式线程安全
 * @author: ZNXM-007
 * @date 2020/3/13 8:28
 */
public class SynchronizedSingleton {

    private static SynchronizedSingleton singleton = null;

    private SynchronizedSingleton() {}

    //在多线程情况下不会有两个线程同时获得该对象,但是随之影响的是性能
    public static synchronized SynchronizedSingleton getInstance() {
        if(singleton == null) {
            singleton = new SynchronizedSingleton();
        }
            return singleton;

    }

    public void print(){
        System.out.println(Thread.currentThread()+"-------------");
    }
}
