package eventos.manejadores;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class TextoEventHandler implements EventHandler<KeyEvent> {

    private Button botonEnviar;

    public TextoEventHandler(Button botonEnviar) {
        this.botonEnviar = botonEnviar;
    }

    @Override
    public void handle(KeyEvent event) {

        System.out.println("TextoEventHandler -> handle: " + event.getCode());

        if (event.getCode() == KeyCode.ENTER) {
            Event.fireEvent(botonEnviar, new ActionEvent());
        }

    }
}
