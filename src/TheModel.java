
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chinm
 */
public class TheModel extends AbstractTableModel{
 
    private String[] columns;
    private Object[][] rows;
    
    public TheModel(){}
    
    public TheModel(Object[][] data,String[] columnName)
    {
        this.columns=columnName;
        this.rows=data;
    }
    
    public Class getColumnClass(int column)
    {
        if(column==5)
            return Icon.class;
        else
            return getValueAt(0,column).getClass();
            
    }
   
    public int getRowCount() {
        return this.rows.length;
    }

    public int getColumnCount() {
      return this.columns.length;
    }

   
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col)
    {
        return this.columns[col];
    }
    
    
}

