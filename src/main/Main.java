package main;

import views.ViewMessage;
import models.ModelMessage;
import controllers.ControllerMessage;


public class Main {

    
    public static void main(String[] args) {
        // ...
        ModelMessage modelmessage = new ModelMessage();
        ViewMessage viewmessage = new ViewMessage();
        ControllerMessage controllermessage = new ControllerMessage(modelmessage, viewmessage);
    }
    
}
