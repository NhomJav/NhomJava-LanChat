
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cau.lethien2
 */
public class IconLabelListRenderer extends DefaultListCellRenderer {
  private JLabel label;

  public IconLabelListRenderer(){
    label = new JLabel();
    label.setOpaque(true);
  }

  @Override
  public Component getListCellRendererComponent(
                     JList<? extends Object> list, 
                     Object value, 
                     int index, 
                     boolean selected, 
                     boolean expanded) {
    ListItem item = (ListItem)value;
		
    if(item.isActive) 
      this.label.setIcon(new ImageIcon(this.getClass().getResource("/images/online.png")));
    
    this.label.setText(item.label);
    this.label.setToolTipText(item.label);
    if (selected) {
      label.setBackground(list.getSelectionBackground());
      label.setForeground(list.getSelectionForeground());
    } else {
      label.setBackground(list.getBackground());
      label.setForeground(list.getForeground());
    }

    return label;
  }
}