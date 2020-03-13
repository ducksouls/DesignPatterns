package cn.lai.designpatterns.singleton;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 8:28
 */
public class SimpleSingleton {

    private static SimpleSingleton singleton;

    private SimpleSingleton() {}

    public static SimpleSingleton getInstance() {
        if(singleton == null) {
            singleton =  new SimpleSingleton();
        }
            return singleton;

    }
}
