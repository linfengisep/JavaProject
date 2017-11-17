package jdbcDataBase;

public class DBColumnString extends DBColumn {
	protected  int size;

	  protected DBColumnString(final String name, final SQLType SQLType,final String isNullable,final int size)
	    {
	       super(name, SQLType, isNullable);
	       this.size = size ;
	    }

	  @Override
	    public String toSQL()
	    {
	        final StringBuffer sb = new StringBuffer();
	        sb.append(String.format("%s %s (%s)", this.getName(), this.getSQLType(), this.size));
	         //try one example: format (first_name,varchar,2000k)
	        return sb.toString();//then when we call this method, we get the result:actor.first_name string 2000
	    }
}
