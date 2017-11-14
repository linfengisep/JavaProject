
public class DBBase {

    private java.util.List<DBTable> tables = new java.util.LinkedList();
    private String dbName = null;

    protected DBBase(final String dbName)
    {
      this.dbName = dbName;
    }

    public String toSQL()
    {
      //syntaxe to create a database:CREATE DATABASE databasename;
      final StringBuffer sb = new StringBuffer();
      sb.append("CREATE DATABASE " + this.dbName);
      for (DBTable table : tables)
      {
        sb.append(table.toSQL());
      }
      return sb.toString();
    }

}
