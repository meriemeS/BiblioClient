/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Client;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author moulaYounes
 */
public class ClientHelper extends AbstractHelper<Client> {

    private static AbstractHelperItem[] titres;

   static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("LOGIN","id"),
            new AbstractHelperItem("NOM","nom"), new AbstractHelperItem("PRENOM","prenom"), 
            new AbstractHelperItem("MOT DE PASS","password")};
    }

    public ClientHelper(JTable jTable, List<Client> list) {
        super(titres, jTable, list);
    }

    public ClientHelper(JTable jTable) {
        super(titres, jTable);

    }
     @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }

}
