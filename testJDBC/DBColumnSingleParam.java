

public class DBColumnSingleParam extends DBColumn {
    protected int size;

    @Override
    public String toSQL()
    {
      final StringBuffer sb = new StringBuffer();
      sb.append(super.getName() + " " + super.getSQLType() + "( " + this.size + " )" );

      return sb.toString();
    }

}
