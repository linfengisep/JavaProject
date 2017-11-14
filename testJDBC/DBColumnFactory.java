
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBColumnFactory
{
    private DBColumnFactory()
    {
    }

    public static DBColumn DBColumnFactory(ResultSet columnRS) throws SQLException
    {
        String columnName = columnRS.getString(4);
        String datatype = columnRS.getString("DATA_TYPE");
        String typeName = columnRS.getString("TYPE_NAME");
        String columnSize = columnRS.getString("COLUMN_SIZE");
        String decimalDigits = columnRS.getString("DECIMAL_DIGITS");
        String typeNameNumbers = (columnSize != null) ? "(" + columnSize + ")" : "";
        String isNullable = columnRS.getString("IS_NULLABLE");
        String isNullableBool = (isNullable == "YES") ? "NULL" : "NOT NULL";
        String isAutoIncrement = columnRS.getString("IS_AUTOINCREMENT");
        String isAutoIncrementBool = (isAutoIncrement == "YES") ? " AUTO_INCREMENT" : "";

        DBColumn.SQLType colType = DBColumn.SQLType.valueOf(typeName.trim().toUpperCase());
        return DBColumnFactory(columnName, colType, columnSize, is);
    }

    public static DBColumn DBColumnFactory(final String colName, final DBColumn.SQLType colType, int colSize, boolean isNullable, int precision, int radix)
    {
        switch (colType)
        {
            case VARCHAR:
            case CHAR:
                return new DBColumnString(colName, colSize, colSize, isNullable);
            case NUMERIC:
            case DOUBLE:
                return new DBColumnNumeric(colName, colSize, precision, radix, isNullable);
            default:
                return new DBColumn(colName, colSize, isNullable);
        }
    }
}
