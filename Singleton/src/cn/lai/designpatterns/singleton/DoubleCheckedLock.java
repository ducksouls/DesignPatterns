package cn.lai.designpatterns.singleton;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 9:22
 */
public class DoubleCheckedLock {
    private volatile static DoubleCheckedLock singleton;

    private DoubleCheckedLock() {
    }

    public static DoubleCheckedLock getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckedLock.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLock();
                }
            }
        }
        return singleton;

    }
}
