package jdbcDataBase;
import java.util.LinkedList;
import java.util.List;

public class DBTable {
	private List<DBColumn> columns = new LinkedList<DBColumn>();
    private String tableName=null;

    protected DBTable(final String tableName)
   {
        this.tableName = tableName;
   }

    public String toSQL()
    {
    	final StringBuffer sb = new StringBuffer();
    	
        sb.append("CREATE TABLE "+this.tableName +"( ");
        
        for (DBColumn column : columns)
        {
            sb.append(column.toSQL());
            //table belongs to the instances of DBTables thus, table.toSQL(), calls the BDTable instances' method;
        }
        sb.append(");");
        return sb.toString();
    }
}
