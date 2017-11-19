package jdbcDataBase;
import java.nio.file.*;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBDemo {

	static String url=null;
	static String username=null;
	static String userpassword=null;
	static StringBuffer sb=new StringBuffer();
	
	//database metadata info
	static Connection connection = null;
	static DatabaseMetaData metadata = null;
	
	//iniatilized tables;
	static ResultSet rs=null;
	
	public DBDemo(String url,String username,String userpassword){
		this.url=url;
		this.username=username;
		this.userpassword=userpassword;
	}
	
	static DatabaseMetaData getConnected(){
		
		url="jdbc:mysql://localhost:8889/sakila";
		username="root";
		userpassword="root";
		
	 try {
            connection = DriverManager.getConnection(url,username,userpassword);
           } catch (SQLException e) {
            System.err.println("There was an error getting the connection: "
                    + e.getMessage());
           }
     try {
            metadata = connection.getMetaData();
          
            sb.append("---UserName:"+metadata.getUserName());
			sb.append(System.getProperty("line.separator"));  
			sb.append("---ProductName:"+metadata.getDatabaseProductName());
			sb.append(System.getProperty("line.separator")); 
			
         } catch (SQLException e) {
            System.err.println("There was an error getting the metadata: "
                    + e.getMessage());
         }
		
		return metadata;
	}
	 
	public static void main(String[]args) throws SQLException{
		
		 //connect
		getConnected();
		 //database
		String database=DBBaseFactory.DBBaseFactory("sakila").toSQL();
		sb.append(database);
		sb.append(System.getProperty("line.separator"));
		
		 //table:get the table names;
		rs=getConnected().getTables(null,null,"%",null);
		while(rs.next()){
			String tableNames=DBTableFactory.DBTableFactory(rs.getString("TABLE_NAME")).toSQL();
			sb.append(tableNames);

			sb.append(System.getProperty("line.separator"));
		}
		
		//column:get column infos;
		
	
		//test sql script;
		System.out.println(sb.toString());
	    //writing sql to the file;
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("src/jdbcDataBase/SQLScriptFile.sql"), "utf-8"));
		    writer.write(sb.toString());
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
   }
}
