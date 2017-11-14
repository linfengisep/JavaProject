import java.sql.SQLException;

public class DBColumnFactory {

    private DBColumnFactory() {
    }
   //this is the constructor for the database column ;
    public static DBColumn DBColumnFactory(java.sql.ResultSet columnRS)
            throws SQLException {
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
        return new DBColumnFactory(columnName,typeName,);
    }

    public static DBColumn DBColumnFactory(final String colName, final DBColumn.SQLType colType) {
        switch (colType) {
            case VARCHAR:
            case CHAR:
                return new DBColumnSingleParam();
            default:
                return new DBColumn();
        }
    }
}
