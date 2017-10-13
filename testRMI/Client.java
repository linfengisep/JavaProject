import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client{
   private Client(){};

   public static void main(String args[]){
   String host =(args.length<1) ? null:args[0];
   try{
         Registry registry =LocateRegistry.getRegistry(Integer.parseInt(host));//server host
         Hello stub=(Hello) registry.lookup("ServerStubName");// look for the remote stub by its name in the registry

         String response=stub.sayHello();//invokes stub method using stub.
         System.out.println("the response is :"+response);
      }catch(Exception e){
         System.err.println("the exception is:"+e.toString());
         e.printStackTrace();
      }
   }
}
/*The client program obtains a stub for the registry on the server's host,
*looks up the remote object's stub by name in the registry,
*and then invokes the sayHello method on the remote object using the stub.
*/
