# 单例模式

一些对象只需要创建一个，所以经得起时间考验的单例模式是个非常不错的选择
```java
//最简单的单例模式
class MyClass {
    private MyClass(){}
    public static MyClass(){    
        return new MyClass();
    }
}
```

+ 单例中的一些问题
1. 多线程
    + 同步 <br>
    多线程会造成多个实例的情况，使用同步（synchronized）能解决，
    但是可能影响程序的效率
    + 急切的创建好单例
    某些情况单例对象，会被频繁创建，调用。资源在一开始也不是负担太重，
    可以采用 ***饿汉式***
    + 双重检查加锁
    nice！！！
 ```java
class MyClass {
    //保证多个线程使用这个对象都是同一个
    private static volatile MyClass uniqueInstance;
    private MyClass(){}
    public static getInstance(){ 
        if(uniqueInstance == null){
            synchronized (MyClass.class) {
                if(uniqueInstance == null)
                    uniqueInstance = new MyClass();
            } 
        }
        return uniqueInstance;
    }
}
```
 <br>
 2. 多个类加载器可能会创建多个单例对象