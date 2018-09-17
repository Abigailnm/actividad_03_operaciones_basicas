
package extras;

import javax.swing.JOptionPane;

public class DataValidation {
    
    public float string2Float (String valor) { 
        float nana = 0;
        try {
            nana = Float.parseFloat(valor);
        }
        catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Introduce solamente números.");
            nana = 0;
        }
        return nana;
    }
    
    public int string2Int (String valor) { // int
        int nana = 0;
        try {
            nana = Integer.parseInt(valor);
        }
        catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Introduce solamente números.");
            nana = 0;
        }
        return nana;
    }
    
    public double string2Double (String valor) { // double
        double nana = 0;
        try {
            nana= Integer.parseInt(valor);
        }
        catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Introduce solamente números.");
            nana = 0;
        }
        return nana;
    }
    
}

