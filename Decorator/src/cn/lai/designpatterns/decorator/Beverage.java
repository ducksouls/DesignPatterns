package cn.lai.designpatterns.decorator;

/**
 * 饮料的超类
 */
public abstract class Beverage {
    String description = "未知";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
