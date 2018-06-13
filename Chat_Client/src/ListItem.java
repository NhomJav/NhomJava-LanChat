/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cau.lethien2
 */
class ListItem {
  public boolean isActive;
  public String label;

  public ListItem(String label, boolean isActive) {
    this.label = label;
    this.isActive = isActive;
  }
}