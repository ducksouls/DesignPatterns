package cn.lai.designpatterns.iterator;

/**
 * @Description: 将迭代器和需要遍历的"容器"组合到一起的客户端
 * @author: ZNXM-007
 * @date 2020/3/14 9:10
 */
public class Waitor {
    //持有一个需要遍历的"容器"
    private Menu dinerMenu;


    public Waitor (Menu dinerMenu){
        this.dinerMenu  = dinerMenu;
    }

    public void printMenu(){
        //获取迭代器,只能根据hasNext和next两个方法去遍历
        //隐藏了细节
        Iterator iterator = dinerMenu.createIterator();

        while(iterator.hasNext()){
            MenuItem next = (MenuItem)iterator.next();
            System.out.println(next.getName()+"---"+next.getPrice());
        }

    }

}
