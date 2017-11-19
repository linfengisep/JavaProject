package jdbcDataBase;
import java.nio.file.*;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBDemo {

	static String url=null;
	static String username=null;
	static String userpassword=null;
	static StringBuffer sb=new StringBuffer();
	
	//database metadata info
	static Connection connection = null;
	static DatabaseMetaData metadata = null;
	
	//database info
	static String databaseName=null;
	static String dataTableName=null;
	    
	/*public static ArrayList getTables() throws SQLException{
		String table[]={"TABLE"};
		ResultSet rs=null;
		ArrayList tables=null;
		rs=metadata.getTables(null, null, null, table);
		tables=new ArrayList();
		while(rs.next()){
			tables.add(rs.getString("TABLE_NAME"));
		}
		return tables;
	}*/
	/*
	public static void getColumns(ArrayList tables)throws SQLException{
		ResultSet rs=null;
		for(String actualTable:tables){
			rs=metadata.getColumns(null, null, actualTable, null);
			System.out.println(actualTable.toUpperCase());
			while(rs.next()){
				System.out.println(rs.getString("COLUMN_NAME")+rs.getString("TYPE_NAME")+rs.getString("COLUMN_SIZE"));
			}
			System.out.println("\n");
		}
	}
	*/
	public static void main(String[]args) throws SQLException{
		
		  //get the user account info from the terminal;
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
	        
		        
		  //get sql script-database
		String database=DBBaseFactory.DBBaseFactory("sakila").toSQL();
		sb.append(database);
		sb.append(System.getProperty("line.separator"));
		 //get sql script-table
		String table=DBTableFactory.DBTableFactory("Actor").toSQL();
		sb.append(table);
		sb.append(System.getProperty("line.separator"));
		 //get sql script-column
		/*ResultSet rs=metadata.getSchemas();
	    String columns=DBColumnFactory.DBColumnFactory(rs).toSQL();
		sb.append(columns);
		*/
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
