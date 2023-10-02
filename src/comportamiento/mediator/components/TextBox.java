package comportamiento.mediator.components;

import comportamiento.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.Serial;

public class TextBox extends JTextArea implements Component {
    /**
	 * 
	 */
	@Serial
    private static final long serialVersionUID = -1718918134732126730L;
	
	private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}