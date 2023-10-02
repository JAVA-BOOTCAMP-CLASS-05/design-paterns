package comportamiento.mediator.components;

import comportamiento.mediator.Mediator;
import comportamiento.mediator.Note;

import java.awt.event.ActionEvent;
import java.io.Serial;

import javax.swing.JButton;


public class AddButton extends JButton implements Component {
    /**
	 * 
	 */
	@Serial
    private static final long serialVersionUID = -4806590486243838931L;
	
	private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
