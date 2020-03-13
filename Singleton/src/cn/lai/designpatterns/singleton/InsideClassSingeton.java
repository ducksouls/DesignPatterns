package cn.lai.designpatterns.singleton;

/**
 * @Description:静态内部类的单例
 * @author: ZNXM-007
 * @date 2020/3/13 9:53
 */
public class InsideClassSingeton {
    private InsideClassSingeton() {}

    private static class SingleTonHoler{
        private static InsideClassSingeton INSTANCE = new InsideClassSingeton();
    }

    public static InsideClassSingeton getInstance(){
        return SingleTonHoler.INSTANCE;
    }

}
