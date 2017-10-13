source:http://docs.oracle.com/javase/7/docs/technotes/guides/rmi/hello/hello-world.html
objective:
The distributed Hello World example uses a simple client to make a remote method invocation
to a server which may be running on a remote host. The client receives the "Hello, world!" message
from the server.

component:
Hello.java: a remote interface;
Server.java: a remote object implementation that implements the remote interface(Hello.java)
Client.java: a simple client that invokes a method of the remote interface.

Ce tuto se déroule par étapes suivant:
1.Define the remote interface
A remote object if an instance of a class that implements a remote interface.
and declare a set of remote methods.
Each remote methods must declare the java.rmi.RemoteException in its throw clause

2.implement the server
A "server" class is the class which has the main method that creates an instance of the remote object implementation,
exports the remote object,
and then binds that object to a name in JAVA RMI registry.
The class that contains the main method can be the implementation itself or another class entirely.
note:
-->the remote object must be exported to the Java RMI runtime so that it may receive incoming remote calls
-->The static method UnicastRemoteObject.exportObject exports the supplied remote object to receive incoming remote method invocations on an anonymous TCP port
and returns the stub for the remote object to pass to clients.
As a result of the exportObject call, the runtime may begin to listen on a new server socket
or may use a shared server socket to accept incoming remote calls for the remote object.
The returned stub implements the same set of remote interfaces as the remote object's class
and contains the host name and port over which the remote object can be contacted.


3.implement the client
The client program obtains a stub for the registry on the server's host, looks up the remote's stub by name in the registry
and then invokes the sayHello() method on the remote object using the stub.

Pour exécuter les class compilés: voilà les trois étapes pour les réaliser.
1.start the java RMI registry
2.start the server
3.run the client


Note:compiling
go to the repository
then mkdir destDir
javac -d destDir Hello.java Server.java Client.java     //in this way, we can redirect the compiled class to the destination directory.
because Server implement the Hello class, when compiling the Server, need compile it after the compiling of the Hello class.
