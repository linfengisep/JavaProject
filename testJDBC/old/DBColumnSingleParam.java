/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise24;

/**
 *
 * @author Amaia
 */
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
