public class DBColumnString extends DBColumn{
  protected  int size;

  protected DBColumnString(final String name, final String SQLType, final int size, final boolean isNullable)
    {
        super(name, SQLType, isNullable);
       this.size = size ;
    }

  @Override
    public String toSQL()
    {
        final StringBuffer sb = new StringBuffer();
        sb.append(String.format("%s %s (%s)", this.getName(), this.getSQLType(), this.size));

        return sb.toString();
    }

}
