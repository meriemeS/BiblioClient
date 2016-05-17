/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Livre;
import java.util.List;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class LivreHelper extends AbstractTableModel{
        Object[][] rows;
        String[] columns;

   public LivreHelper(Object[][] data,String[] columNames ){
         this.columns=columNames;
         this.rows=data;
         
     }
   @Override
   public Class getColumnClass(int column){
       if (column == 2){
           return Icon.class;
       }
       else{
           return getValueAt(0,column).getClass();
       }
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
    
    public String getColumnName(int col){
        return this.columns[col];
    }
  
}
