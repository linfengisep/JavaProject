
public class DBBaseFactory {

    private DBBaseFactory() {}

    public static DBBase DBBaseFactory(final String dbName)
    {
      return new DBBase(dbName);
    }
}
