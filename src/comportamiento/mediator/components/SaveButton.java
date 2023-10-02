package comportamiento.mediator.components;

import comportamiento.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.Serial;

public class SaveButton extends JButton implements Component {
    /**
	 * 
	 */
	@Serial
    private static final long serialVersionUID = -5785212097435355852L;
	
	private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}