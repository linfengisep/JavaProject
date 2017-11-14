public class DBColumn {
    private String name;
    private String SQLType;

    enum SQLType {
      CHAR,
      VARCHAR,
      DATE,
      TIMESTAMP
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
