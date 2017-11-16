package jdbcDataBase;

public class DBColumn {
	 private String colName;
	    private SQLType sqlType;
	    private boolean isNullable;

	    //class constructor
	    protected DBColumn(final String colName, final SQLType sqlType, final boolean isNullable)
	    {
	        this.colName = colName;
	        this.sqlType = sqlType;
	        this.isNullable = isNullable;
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

	    public boolean isIsNullable() {
	        return isNullable;
	    }

	    public String getName() {
	        return colName;
	    }

	    public SQLType getSQLType() {
	        return sqlType;
	    }

	    public void setIsNullable(boolean isNullable) {
	        this.isNullable = isNullable;
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
	        sb.append("CREATE TABLE "+this.colName + "(" + this.sqlType+")");

	        return sb.toString();
	    }
}
