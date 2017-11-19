package jdbcDataBase;

public class DBColumn {
	 	public String colName;
	    public SQLType sqlType;
	    public String isNullable;

	    //class constructor
	    protected DBColumn(final String colName, final SQLType sqlType, final String isNullableBool)
	    {
	        this.colName = colName;
	        this.sqlType = sqlType;
	        this.isNullable = isNullableBool;
	        
	    }
		//basically, i want to create four many type:text, VARCHAR, DATE, INT;
	    public enum SQLType {
	      TEXT,
	      
	      CHAR,
	      VARCHAR,
	      
	      NUMERIC,
	      INTEGER,
	      FLOAT,
	      DOUBLE,
	      REAL,
	      
	      DATE,
	      TIMESTAMP
	    }
	   
	   //init column
	    public void initColumn(){
	    	
	    }

	    public String toSQL()
	    {
	        final StringBuffer sb = new StringBuffer();
	        sb.append(this.colName +sqlType+isNullable);

	        return sb.toString();
	    }
}
