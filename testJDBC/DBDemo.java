package jdbcDataBase;
import java.nio.file.*;
import java.io.*;
import java.sql.*;


public class DBDemo {

	private String url=null;
	private String username=null;
	private String userpassword=null;
	
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserpassword() {
		return userpassword;
	}


	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	
	public static void main(String[]args){
		  //get the user account info from the terminal;
			DBDemo dbDemo = new DBDemo();
			dbDemo.setUrl(args[0]);
			dbDemo.setUserpassword(args[1]);
			dbDemo.setUsername(args[2]);
		
		  //generate database informations;
		try{ 
			Connection con=DriverManager.getConnection(dbDemo.getUrl(),dbDemo.getUsername(),dbDemo.getUserpassword());  
			DatabaseMetaData dbmd=con.getMetaData();  
			  
			System.out.println("Driver Name: "+dbmd.getDriverName());  
			System.out.println("Driver Version: "+dbmd.getDriverVersion());  
			System.out.println("UserName: "+dbmd.getUserName());  
			System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());  
			System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());  
			  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

		
	      //converting a string to the byte array;
		/*
	      String s=new String(" SQL statements, create database, create tables.");
	      byte data[]=s.getBytes();
	      Path p=Paths.get("/Users/linfengwang/desktop/java/testcode/testJDBC/myFile.txt");
	      
	      //Call the class methods and let them generate some scripts in myFile.txt;
	      */
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("filename.txt"), "utf-8"));
		    writer.write("write file content here");
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
		
		
		
		
   }
}
