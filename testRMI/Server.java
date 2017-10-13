import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {
   public Server(){}

   public String sayHello(){
      return "Hello World through RMI applications";
   }

   public static void main(String args[]){
      String host =(args.length<1) ? null:args[0];
      try{
         /*
         *create and export the remote object,
         */
         Server obj=new Server();
         Hello stub=(Hello)UnicastRemoteObject.exportObject(obj,0);
         /*
         *Registry the remote object with a java RMI Registry;
         *bind the remote object stub to the registry;
         */
         Registry registry=LocateRegistry.getRegistry(Integer.parseInt(host));
         registry.bind("ServerStubName",stub);

         System.out.println("Server is ready!!!!hou,hou,hou.");
      }catch(Exception e){
         System.out.println("Server Exception:"+e.toString());
         e.printStackTrace();
      }
   }
}
