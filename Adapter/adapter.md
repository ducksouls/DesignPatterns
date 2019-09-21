# 适配器模式 & 门面模式

### 适配器
**定义**
讲一个类的接口，转换成客户期望的另一个接口。
适配器让两个不相关（不兼容）的类可以合作无间 

+ 适配器 <br>
 现有系统（adaptee） ==》 适配器（adapter） ==》厂商类（目标target）
无需改变现有代码，目的是为了使用目标类(转换接口)
+ 包装 <br>
初始组件 ==》 增强功能1 ==》 增强功能2 ==》 增强功能3 ==》呈现产品
无需改变现有代码，目的是为了增强原来组件的功能

重合？<br>
**讲一个接口转换成另一个接口**<br>
**不改变接口，但加入责任（新的行为）**<br>

### 门面
___定义___ 提供一个统一的接口，用来访问子系统中的一圈接口。外观定义了一个高层接口<br>
让子系统更容易使用。<br>

让接口变简单

简单来说使用门面是一个**接收**了许多组件的子系统并使其变得**容易操作**的过程<br>
但其功能不限于简化,也能将**客户**从**组件**解耦

+ 门面与适配器的意图
两者实现方式上很接近，包装对象<br>
门面是提供子接口一个简化接口
适配器是转换接口来符合客户需求

### 最少知识原则
`
设计系统时，不管是任何对象，
都要注意它所交互的类有哪些，
并注意它和这些类是如何交互的
`<br>

设计某个对象的方法时`obj.method(){}`，应该考虑调用以下情况的方法：
+ 对象本身的方法
```
obj.method(){
    obj.otherMethod();
}
```
+ 当做方法参数的对象里的方法
```
obj.method(Type t){
    obj.otherMethod();
    t.someMethod();
}
```
+ 方法中创建的实例的方法
```
obj.method(Type t){
    Instance i = new Instance();
    obj.otherMethod();
    t.someMethod();
    i.someMethod();
}
```
+ 对象中的组件(has-a)
```
obj.method(Type t){
    Instance i = new Instance();
    obj.otherMethod();
    t.someMethod();
    i.someMethod();
    obj.anotherObject.method();
}
```

```java
public class Car {
    Engine engine;//组件has-a 
    public Car();
    public void start(Key key) {
        Door door = new Door();
        boolean autorized = key.turns(); //方法参数中的方法
        if(authorized){
            engin.start(); //组件（has-a）的方法 
            updateDashboardDisplay(); //local method
            door.lock(); //方法中实例的对象的方法
        }
    }
    public void updateDashboardDisplay(){}
}
```
***酌情使用***
或许这个原则能让对象的依赖减少，但同时也需要大量的包装去处理对象与对象的链接<br>
