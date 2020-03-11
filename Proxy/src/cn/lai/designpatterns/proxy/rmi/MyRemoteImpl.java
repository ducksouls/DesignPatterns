package cn.lai.designpatterns.proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @Description:
 * @author: ZNXM-007
 * @date 2020/3/10 9:04
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote  {
    public MyRemoteImpl() throws RemoteException {
    }


    @Override
    public String sayHello() throws RemoteException {
        return "server";
    }

    public static void main(String[] args) {
        try {

            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            LocateRegistry.createRegistry(9999);
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("rmi://127.0.0.1:9999/RemoteHello", service);
            System.out.println("service started...");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }


    }
}
