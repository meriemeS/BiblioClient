/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import bean.Livre;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author pc
 */
public class LivreHelper2  extends AbstractHelper<Livre>{
     private static AbstractHelperItem[] titres;

   static {
        titres = new AbstractHelperItem[]{new AbstractHelperItem("Titre","titre"),
                          new AbstractHelperItem("Nom Auteur","nom_aut"),
         new AbstractHelperItem("Prenom auteur","prenom_aut"), new AbstractHelperItem("categorie","lib_cat"),
         new AbstractHelperItem("Description","description")
       };
    }

    public LivreHelper2(JTable jTable, List<Livre> list) {
        super(titres, jTable, list);
    }

    public LivreHelper2(JTable jTable) {
        super(titres, jTable);

    }
     @Override
             public Class getColumnClass(int c) {
        Object o = getValueAt(0, c);
        if(o==null) return Object.class;
        return o.getClass();
    }

}
