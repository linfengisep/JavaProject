package jdbcDataBase;

public class DBColumn {
	 	private String colName;
	    private SQLType sqlType;
	    private String isNullable;

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
	   
	    public String isNullable() {
	        return isNullable;
	    }

	    public String getName() {
	        return colName;
	    }

	    public SQLType getSQLType() {
	        return sqlType;
	    }

	    public void setIsNullable(String isNullableBool) {
	        this.isNullable = isNullableBool;
	   }

	    public void setName(String colName) {
	        this.colName = colName;
	    }

	    public void setSQLType(SQLType sqlType) {
	        this.sqlType = sqlType;
	    }
	    

	    public String toSQL()
	    {
	        final StringBuffer sb = new StringBuffer();
	        sb.append(this.colName +this.getSQLType()+this.isNullable());

	        return sb.toString();
	    }
}
