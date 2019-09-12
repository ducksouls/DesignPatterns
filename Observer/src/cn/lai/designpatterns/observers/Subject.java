package cn.lai.designpatterns.observers;

public interface Subject {
    void registerObserver();
    void removeObserver();
    void notifyObserver();
}
