package jdbcDataBase;

import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcDataBase.DBColumn.SQLType;

public class DBColumnFactory {

    public static DBColumn DBColumnFactory(ResultSet columnRS) throws SQLException
    {
        String columnName = columnRS.getString("COLUMN_NAME");
        
        String datatype = columnRS.getString("DATA_TYPE");
        String typeName = columnRS.getString("TYPE_NAME");
        String columnSizeString = columnRS.getString("COLUMN_SIZE");
        //int columnSize=Integer.parseInt(columnSizeString);
        String decimalDigits = columnRS.getString("DECIMAL_DIGITS");
        //String typeNameNumbers = "(" + columnSize + ")";
        
        String isNullable = columnRS.getString("IS_NULLABLE");
        String isNullableBool = (isNullable == "YES") ? "NULL" : "NOT NULL";
        
        String isAutoIncrement = columnRS.getString("IS_AUTOINCREMENT");
        String isAutoIncrementBool = (isAutoIncrement == "YES") ? " AUTO_INCREMENT" : "";

        //DBColumn.SQLType colType = DBColumn.SQLType.valueOf(typeName.trim().toUpperCase());
        DBColumn.SQLType colType = DBColumn.SQLType.TEXT;
        //String colType = columnRS.getString(typeName);
        //return DBColumnFactory (columnName,colType,isNullableBool,columnSize,isAutoIncrement,typeNameNumbers);
        return DBColumnFactory (columnName,colType,isNullableBool);
    }
    //what's precision? what is radix?
/*
    public static DBColumn DBColumnFactory(final String colName, final DBColumn.SQLType colType, String isNullableBool,int colSize, String isAutoIncrementBool,String typeNameNumbers)
	//public DBColumnNumeric(final String colName, final SQLType colType,final boolean isNullable,final int colSize, final int precision, final int radix){
    //difference between the types.
    
    {
        switch (colType)
        {
            case VARCHAR:
            case CHAR:
                return new DBColumnString(colName, colType, isNullableBool, colSize);
            case NUMERIC:
            case DOUBLE:
                return new DBColumnNumeric(colName, colType, isNullableBool, colSize,isAutoIncrementBool);
            default:
                return new DBColumn(colName, colType, isNullableBool);
        }
    }
}
*/
    
    public static DBColumn DBColumnFactory(final String colName, final DBColumn.SQLType colType, String isNullableBool)
  	//public DBColumnNumeric(final String colName, final SQLType colType,final boolean isNullable,final int colSize, final int precision, final int radix){
      //difference between the types.
      
      {
          switch (colType)
          {
              case VARCHAR:
              case CHAR:
            	  return new DBColumn(colName, colType, isNullableBool);
                  //return new DBColumnString(colName, colType, isNullableBool, colSize);
              case NUMERIC:
              case DOUBLE:
            	  return new DBColumn(colName, colType, isNullableBool);
                  //return new DBColumnNumeric(colName, colType, isNullableBool, colSize,isAutoIncrementBool);
              default:
                  return new DBColumn(colName, colType, isNullableBool);
          }
      }
  }
