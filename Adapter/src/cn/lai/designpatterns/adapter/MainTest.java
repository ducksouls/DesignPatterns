package cn.lai.designpatterns.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class MainTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        //将火鸡伪装成了鸭子...
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        System.out.println("-----------");
        mallardDuck.fly();
        mallardDuck.quack();


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //现在将迭代适配成枚举
        IteratorEnum iteratorEnum = new IteratorEnum(list.iterator());
        while (iteratorEnum.hasMoreElements()) {
            Integer integer = (Integer) iteratorEnum.nextElement();
            System.out.println(integer);
        }
        System.out.println("------------------");



        Vector<Integer> v = new Vector<>(list);
        Enumeration<Integer> elements = v.elements();
        //古老的方式,现在想用迭代了(假设并没有添加迭代的方法)
        while( elements.hasMoreElements()){
            Integer integer =elements.nextElement();
            System.out.println(integer);
        }
        System.out.println("-------------");
        Enumeration<Integer> elements1 = v.elements();
        //这是一个迭代器
        EnumerationIterator it = new EnumerationIterator(elements1);
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------");


    }

}
