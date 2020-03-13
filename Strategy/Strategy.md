# 策略模式

### 定义: 定义了算法簇,
让他们之间可以相互替换,
此模式让算法的变化独立于使用算法的客户


### 类图:<br>
![](img/strategy.gif)

### 比较: 
与之比较相似的设计模式`状态模式`,类图一样,
主要差别在`意图`
策略模式是,客户端指定使用哪个策略,即:context知道所有的策略
而状态模式的状态转换时由state子类自身完成的,
所以对context来说转换过程是透明的