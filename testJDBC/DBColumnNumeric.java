package jdbcDataBase;

public class DBColumnNumeric extends DBColumn{
	   protected int size;

	   public DBColumnNumeric(final String colName, final SQLType colType,final boolean isNullable,final int colSize){
	   //public DBColumnNumeric(final String colName, final SQLType colType,final boolean isNullable,final int colSize, final int precision, final int radix){

		   super(colName,colType,isNullable);

	      this.size=colSize;
	   }
	   @Override
	   public String toSQL(){
	      final StringBuffer sb = new StringBuffer();
	      sb.append(String.format("%s %s (%s)", this.getName(), this.getSQLType(), this.size));

	      return sb.toString();
	   }
}
