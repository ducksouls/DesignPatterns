package cn.lai.designpatterns.decorator;

/**
 * 装饰器修饰完原来的内容后，修改了对象的类型？
 */

public class GiveMeCoffe {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        Beverage hb = new HouseBlend();


        System.out.println("第1次----" + decaf);
        //cn.lai.designpatterns.decorator.Decaf@1b6d3586


        System.out.println(decaf.cost() + "-----" + decaf.getDescription());
         decaf = new Milk(decaf);
         //cn.lai.designpatterns.decorator.Milk@4554617c
        System.out.println("第2次----" + decaf);

         decaf = new Mocha(decaf);
         // cn.lai.designpatterns.decorator.Mocha@74a14482
        System.out.println("第3次----" + decaf);
        System.out.println(decaf.cost() + "-----" + decaf.getDescription());
    }
}
