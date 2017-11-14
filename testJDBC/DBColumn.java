
package exercise24;

public class DBColumn 
{
    private String name;
    private String SQLType; 
    private boolean isNullable;
    
    protected DBColumn(final String name, final String SQLType, final boolean isNullable)
    {
        this.name = name;
        this.SQLType = SQLType;
        this.isNullable = isNullable;
    }
    
    enum SQLType {
      CHAR,
      VARCHAR,
      NVARCHAR,
      NCHAR,
      NUMERIC, 
      DOUBLE,
      DATE,
      TIMESTAMP
    }

    public void setIsNullable(boolean isNullable) {
        this.isNullable = isNullable;
    }

    public boolean isIsNullable() {
        return isNullable;
    }
    
    public String getName() {
        return name;
    }

    public String getSQLType() {
        return SQLType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSQLType(String SQLType) {
        this.SQLType = SQLType;
    }
   
    public String toSQL()
    {
        final StringBuffer sb = new StringBuffer();
        sb.append(this.name + " " + this.SQLType);
  
        return sb.toString();
    }
}
