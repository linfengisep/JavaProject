package exercise24;

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
        }
        return sb.toString();
    }

}
