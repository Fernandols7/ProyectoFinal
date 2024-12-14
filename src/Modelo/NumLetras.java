
package Modelo;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class NumLetras {
    
public void SoloLetras(KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_BACK_SPACE) && (c != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }
 
    public void SoloNumeros(KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }
 
    public void NumerosDecimales(KeyEvent evt, JTextField textField) {
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && textField.getText().contains(".") && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        } else if ((c < '0' || c > '9') && (c != '.') && (c != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }
}
