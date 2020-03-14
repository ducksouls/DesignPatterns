package cn.lai.designpatterns.iterator;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/14 9:10
 */
public class Waitor {
    private Menu dinerMenu;

    public Waitor (Menu dinerMenu){
        this.dinerMenu  = dinerMenu;
    }

    public void printMenu(){
        Iterator iterator = dinerMenu.createIterator();

        while(iterator.hasNext()){
            MenuItem next = (MenuItem)iterator.next();
            System.out.println(next.getName()+"---"+next.getPrice());
        }

    }

}
