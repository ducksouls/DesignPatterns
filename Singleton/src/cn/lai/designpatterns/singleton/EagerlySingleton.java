package cn.lai.designpatterns.singleton;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 9:15
 */
public class EagerlySingleton {
    private static EagerlySingleton instance = new EagerlySingleton();
    private EagerlySingleton(){}

    public static EagerlySingleton getInstance(){
        return instance;
    }
}
