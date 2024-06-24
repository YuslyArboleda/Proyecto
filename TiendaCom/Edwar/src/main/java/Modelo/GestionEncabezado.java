
package Modelo;

import java.awt.Component;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;


public class GestionEncabezado implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

    JComponent encabezado = null;
    encabezado = new JLabel((String)value);
    ((JLabel)encabezado).setHorizontalAlignment(SwingConstants.CENTER);
    Object Cellvalue = value;
   
    return encabezado;
}
//    encabezado.setBorder()
}
    

