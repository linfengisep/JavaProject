package jdbcDataBase;

import java.util.LinkedList;
import java.util.List;


public class DBBase
{
    private List<DBTable> tables = new LinkedList();
    private String dbName = null;

    protected DBBase(final String dbName)
    {
        this.dbName = dbName;
    }

    public String toSQL()
    {
        final StringBuffer sb = new StringBuffer();
        sb.append("CREATE DATABASE " + this.dbName);
        for (DBTable table : tables)
        {
            sb.append(table.toSQL());
            //table belongs to the instances of DBTables thus, table.toSQL(), calls the BDTable instances' method;
        }
        return sb.toString();
    }

}
