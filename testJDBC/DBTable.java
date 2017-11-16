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
        return "My SQL statements for the table";
    }
}
