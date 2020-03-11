package cn.lai.designpatterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/10 9:02
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
