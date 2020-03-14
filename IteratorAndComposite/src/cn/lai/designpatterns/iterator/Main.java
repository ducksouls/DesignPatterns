package cn.lai.designpatterns.iterator;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/14 11:39
 */
public class Main {
    public static void main(String[] args) {
        Waitor waitor = new Waitor(new DinerMenu());
        waitor.printMenu();
    }
}
