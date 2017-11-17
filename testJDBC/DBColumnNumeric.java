package jdbcDataBase;

public class DBColumnNumeric extends DBColumn{
	   protected int size;
	   protected String isAutoIncrementBool=null;

	   public DBColumnNumeric(final String colName, final SQLType colType,final String isNullable,final int colSize,final String auto_increment){
	   //public DBColumnNumeric(final String colName, final SQLType colType,final boolean isNullable,final int colSize, final int precision, final int radix){

		   super(colName,colType,isNullable);
		  this.isAutoIncrementBool=isAutoIncrementBool;
	      this.size=colSize;
	   }
	   @Override
	   public String toSQL(){
	      final StringBuffer sb = new StringBuffer();
	      sb.append(String.format("%s %s (%s),", this.getName(), this.getSQLType(), this.size));

	      return sb.toString();
	   }
}
