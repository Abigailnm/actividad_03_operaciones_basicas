
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewMessage;
import models.ModelMessage;
import extras.DataValidation;

public class ControllerMessage {
    

    ViewMessage viewmessage;
    ModelMessage modelmessage;
    DataValidation dataValidation = new DataValidation();
    
    ActionListener actionlistener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewmessage.jb_suma) {
                jb_suma_action_performed();
            }
            else if (e.getSource() == viewmessage.jb_resta) {
                jb_resta_action_performed();
            }
            else if (e.getSource() == viewmessage.jb_multiplicacion) {
                jb_multiplicacion_action_performed();
            }
            else if (e.getSource() == viewmessage.jb_division) {
                jb_division_action_performed();
            }
            else if (e.getSource() == viewmessage.jb_modulo) {
                jb_modulo_action_performed();
            }
            
            else if (e.getSource() == viewmessage.jb_limpiar) {
                jb_limpiar_action_performed();
            }
        }
    };
    
    
    public ControllerMessage(ModelMessage ModelCalc, ViewMessage ViewCalc) {
        this.viewmessage = ViewCalc;
        this.modelmessage = ModelCalc;
        
        this.viewmessage.jb_suma.addActionListener(actionlistener);
        this.viewmessage.jb_resta.addActionListener(actionlistener);
        this.viewmessage.jb_multiplicacion.addActionListener(actionlistener);
        this.viewmessage.jb_division.addActionListener(actionlistener);
        this.viewmessage.jb_modulo.addActionListener(actionlistener);
        this.viewmessage.jb_limpiar.addActionListener(actionlistener);
        initComponents();
    }
    

    public void obtencion() {
        modelmessage.setNumero1(dataValidation.string2Float(viewmessage.jtf_numero1.getText()));
        modelmessage.setNumero2(dataValidation.string2Float(viewmessage.jtf_numero2.getText()));
    }
    public void asignacion() {
        modelmessage.setCad_resultado(Float.toString(modelmessage.resultado));
        viewmessage.jl_resultado.setText("El resultado es: " + modelmessage.getCad_resultado());
    }
    

    public void jb_suma_action_performed() {
        this.obtencion();
        modelmessage.suma();
        this.asignacion();
    }
    public void jb_resta_action_performed() {
        this.obtencion();
        modelmessage.resta();
        this.asignacion();
    }
    public void jb_multiplicacion_action_performed() {
        this.obtencion();
        modelmessage.multiplicacion();
        this.asignacion();
    }
    public void jb_division_action_performed() {
        this.obtencion();
        modelmessage.division();
        this.asignacion();
    }
    public void jb_modulo_action_performed() {
        this.obtencion();
        modelmessage.modulo();
        this.asignacion();
    }
    
    public void jb_limpiar_action_performed() {
        viewmessage.jtf_numero1.setText("");
        viewmessage.jtf_numero2.setText("");
        viewmessage.jl_resultado.setText("El resultado es: ");
    }
    

    public void initComponents() {
        viewmessage.setVisible(true);
    }
    
}



