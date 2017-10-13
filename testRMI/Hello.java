import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote{
   String sayHello() throws RemoteException;
}
//A remote interface extends the interface java.rmi.Remote and declares a set of remote methods.

//Hello is the remote interface

//instanciate Hello could get a remote object
