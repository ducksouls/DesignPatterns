package cn.lai.designpatterns.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/10 9:08
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
//            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:9999/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
