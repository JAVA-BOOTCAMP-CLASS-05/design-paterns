package comportamiento.mediator.components;

import comportamiento.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.Serial;

public class DeleteButton extends JButton  implements Component {
    /**
	 * 
	 */
	@Serial
    private static final long serialVersionUID = 6242876466945663434L;
	
	private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
}
