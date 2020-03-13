package cn.lai.designpatterns.templatemethod.cook;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/13 16:34
 */
public abstract class  AbstractDoDishesTemplate {

    /**
     * 洗菜,切菜,烹饪,装盘
     */
    final void doDishes(){
        this.preparation();
        this.cutUp();
        this.cook();
        this.dishUp();
        this.hook();
    }

    void hook(){}

    protected  void dishUp() {
        System.out.println("装盘");
    }

    protected abstract void cook();

    protected abstract void cutUp();

    protected  void preparation(){
        System.out.println("买菜,洗菜");
    }
}
