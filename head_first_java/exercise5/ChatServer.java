import java.io.*;
import java.net.*;
public class ChatServer{
   String [] adviceList={
      "Take smaller bites",
      "Go for the tight jeans",
      "just for today",
      "tell your boss what you really think"
   };
   public void go(){
      try{
            ServerSocket socketSock = new ServerSocket(4242);
         while(true){
            Socket sock = socketSock.accept();
            PrintWriter writer = new PrintWriter(sock.getOutputStream());
            String advice = getAdvice();
            writer.println(advice);
            writer.close();
            System.out.println(advice);
      }

      }catch(IOException ex){
      ex.printStackTrace();
      }
   }
   public String getAdvice(){
      int random = (int)(Math.random()*adviceList.length);
      return adviceList[random];
   }

   public static void main(String[]args){
   ChatServer server = new ChatServer();
   server.go();
   }
}
