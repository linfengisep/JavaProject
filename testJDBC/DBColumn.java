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
	      
	      SMALLINT,
	      
	      FLOAT,
	      DOUBLE,
	      REAL,
	      
	      DATE,
	      TIMESTAMP
	    }

	    public String toSQL()
	    {
	        final StringBuffer sb = new StringBuffer();
	        sb.append(this.colName +" "+sqlType+" "+isNullable);
	        sb.append(System.getProperty("line.separator"));
	        return sb.toString();
	    }
}
